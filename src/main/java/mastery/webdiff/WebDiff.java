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

    public WebDiff(int port) {
        if (port < 0) {
            this.port = 8088;
            System.err.printf("Invalid port number, using %d\n", this.port);
        }
        else this.port = port;
    }

    public void apply(File fSrc, File fDst, Tree src, Tree dst, MappingStore mappings) {
        configureSpark(fSrc, fDst, src, dst, mappings, port);
        Spark.awaitInitialization();
        System.out.println(String.format("Starting server: %s:%d", "http://127.0.0.1", port));
    }

    public static void configureSpark(File fSrc, File fDst, Tree src, Tree dst, MappingStore mappings, int port) {
        port(port);
        staticFiles.location("/webdiff/");

        get("/", (request, response) -> {
            Renderable view = new DiffView(fSrc, fDst, src, dst, mappings);
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
