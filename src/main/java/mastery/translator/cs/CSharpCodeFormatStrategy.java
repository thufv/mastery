package mastery.translator.cs;

import krasa.formatter.adapter.CppCodeFormatterFacade;
import krasa.formatter.exception.FileDoesNotExistsException;
import krasa.formatter.settings.Settings;
import krasa.formatter.settings.provider.CppPropertiesProvider;
import mastery.translator.CodeFormatStrategy;

public class CSharpCodeFormatStrategy implements CodeFormatStrategy {
    @Override
    public String apply(String raw) {
        // TODO: support C# formatter
        System.out.println("The formatter for C# has not been finished.");
        return raw;
    }
}
