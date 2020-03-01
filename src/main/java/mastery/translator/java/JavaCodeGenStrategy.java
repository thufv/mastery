package mastery.translator.java;

import mastery.translator.CodeGenStrategy;

public class JavaCodeGenStrategy extends CodeGenStrategy {
    @Override
    protected String wrapComment(String content) {
        return String.format("/* %s */", content);
    }
}
