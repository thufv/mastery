package mastery.translator;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Code generator.
 */
public abstract class CodeGenStrategy {
    private JsonObject object;

    /**
     * Invoke generation.
     *
     * @return the generated code, raw (hasn't been formatted)
     */
    public String apply(String tree) {
        Gson gson = new Gson();
        object = gson.fromJson(tree, JsonObject.class);

        StringBuilder sb = new StringBuilder();
        collect(sb, object);
        return sb.toString();
    }

    private void collect(StringBuilder sb, JsonObject obj) {
        String kind = obj.get("kind").getAsString();
        if (kind.equals("node")) {
            JsonArray arr = obj.getAsJsonArray("children");
            arr.forEach(e -> collect(sb, e.getAsJsonObject()));
        } else if (kind.equals("leaf")) {
            String token = obj.get("code").getAsString();
            if(token.equals("<EOF>")) return;
            sb.append(token);
            sb.append(' ');
        } else if (kind.equals("error")) {
            String msg = obj.get("code").getAsString();
            sb.append(wrapComment("ERROR: " + msg));
            sb.append(' ');
        } else {
            System.err.println(String.format("Ignore invalid kind: %s", kind));
        }
    }

    /**
     * Language-specific method to be implemented: wrap content as a comment.
     *
     * @param content the content
     * @return a string representing a comment in the specific language
     */
    protected abstract String wrapComment(String content);
}