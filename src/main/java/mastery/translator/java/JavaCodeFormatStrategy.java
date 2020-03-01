package mastery.translator.java;

import mastery.translator.CodeFormatStrategy;

import java.io.*;
import krasa.formatter.settings.Settings;
import krasa.formatter.eclipse.JavaCodeFormatterFacade;
import krasa.formatter.exception.FileDoesNotExistsException;

import com.intellij.psi.util.PsiUtilCore;
import com.intellij.openapi.command.impl.DummyProject;

public class JavaCodeFormatStrategy implements CodeFormatStrategy {
    @Override
    public String apply(String raw) {
        try{
            Settings settings = new Settings();
            settings.setPathToConfigFileJava("formatter_config/java/org.eclipse.jdt.core.prefs");
            JavaCodeFormatterFacade javaCodeFormatterFacade = new JavaCodeFormatterFacade(settings.getJavaProperties(),
                    settings.getEclipseVersion(), DummyProject.getInstance(), settings.getPathToEclipse());
            raw = javaCodeFormatterFacade.format(raw, 0, raw.length(), PsiUtilCore.NULL_PSI_FILE);
        } catch (FileDoesNotExistsException e) {
            System.out.println("Cannot find a config file for the formatter: formatter_config/java/org.eclipse.jdt.core.prefs");
        }
        return raw;
    }
}
