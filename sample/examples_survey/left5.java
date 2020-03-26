public class TempBuilder {
    public TempBuilder() {
        for (int i = 0; i < rules.size(); i++) {
            EditorConfig.OutPair rule = rules.get(i);

            changed = doInsertFinalNewLine(primaryFile);
        }
    }
}