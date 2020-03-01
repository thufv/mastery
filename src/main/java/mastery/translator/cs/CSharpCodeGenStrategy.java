package mastery.translator.cs;

import mastery.translator.CodeGenStrategy;

public class CSharpCodeGenStrategy extends CodeGenStrategy {
    @Override
    protected String wrapComment(String content) {
        return String.format("/* %s */", content);
    }
}
