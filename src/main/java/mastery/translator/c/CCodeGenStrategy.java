package mastery.translator.c;

import mastery.translator.CodeGenStrategy;

public class CCodeGenStrategy extends CodeGenStrategy {
    @Override
    protected String wrapComment(String content) {
        return String.format("/* %s */", content);
    }
}
