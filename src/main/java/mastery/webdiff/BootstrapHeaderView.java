package mastery.webdiff;

import static org.rendersnake.HtmlAttributesFactory.*;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;

public class BootstrapHeaderView implements Renderable {

    @Override
    public void renderOn(HtmlCanvas html) throws IOException {
        html
        .head()
            .meta(charset("utf8"))
            .meta(name("viewport").content("width=device-width, initial-scale=1.0"))
            .title().content("GumTree")
            .macros().stylesheet("/dist/bootstrap.min.css")
            .macros().stylesheet("/dist/gumtree.css")
        ._head();
    }

}
