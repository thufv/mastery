package mastery.webdiff;

import mastery.tree.Tree;
import mastery.matcher.MappingStore;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;
import spark.Spark;

import java.io.File;
import java.io.IOException;

import static spark.Spark.*;

public class WebDiff {
    int port;
    String algorithm;

    public WebDiff(int port, String algorithm) {
        this.port = port;
        this.algorithm = algorithm;
    }

    public void apply(File fSrc, File fDst, Tree src, Tree dst, MappingStore mappings) {
        configureSpark(fSrc, fDst, src, dst, mappings, port, algorithm);
        Spark.awaitInitialization();
        System.out.println(String.format("Starting server: %s:%d", "http://127.0.0.1", port));
    }

    public static void configureSpark(File fSrc, File fDst, Tree src, Tree dst, MappingStore mappings, int port, String algorithm) {
        port(port);
        staticFiles.location("/web/");
        get("/", (request, response) -> {
            // System.out.println("capture a request");

            Renderable view = new DiffView(fSrc, fDst, src, dst, mappings, algorithm);

            // System.out.println("Start render");

            return render(view);
        });
    }

    private static String render(Renderable r) {
        HtmlCanvas c = new HtmlCanvas();
        try {
            r.renderOn(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c.toHtml();
    }
}
