package mastery.translator.c;

import mastery.translator.CodeFormatStrategy;

import java.io.*;
import krasa.formatter.settings.Settings;
import krasa.formatter.settings.provider.CppPropertiesProvider;
import krasa.formatter.adapter.CppCodeFormatterFacade;
import krasa.formatter.exception.FileDoesNotExistsException;

public class CCodeFormatStrategy implements CodeFormatStrategy {
    @Override
    public String apply(String raw) {
        try{
            Settings settings = new Settings();
            settings.setPathToConfigFileCpp("formatter_config/c/org.eclipse.cdt.core.prefs");
            CppCodeFormatterFacade cppCodeFormatterFacade = new CppCodeFormatterFacade(new CppPropertiesProvider(settings));
            raw = cppCodeFormatterFacade.format(raw, 0, raw.length(), null);
        } catch (FileDoesNotExistsException e) {
            System.out.println("Cannot find a config file for the formatter: formatter_config/c/org.eclipse.cdt.core.prefs");
        }
        return raw;
    }
}
