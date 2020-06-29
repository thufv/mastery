package mastery.webdiff;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;

import java.io.IOException;

public class BootstrapFooterView implements Renderable {

    @Override
    public void renderOn(HtmlCanvas html) throws IOException {
        html
        .macros().javascript("/dist/jquery.min.js")
        .macros().javascript("/dist/bootstrap.min.js");
    }

}