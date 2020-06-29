package mastery.webdiff;

import mastery.actions.RootAndLeavesClassifier;
import mastery.actions.TreeClassifier;
import mastery.util.StringAlgorithms;
import mastery.matcher.MappingStore;
import mastery.tree.Tree;
import gnu.trove.map.TIntIntMap;
import gnu.trove.map.hash.TIntIntHashMap;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public final class HtmlDiffs {

    private static final String SRC_MV_SPAN = "<span class=\"%s\" id=\"move-src-%d\" data-title=\"%s\">";
    private static final String DST_MV_SPAN = "<span class=\"%s\" id=\"move-dst-%d\" data-title=\"%s\">";
    private static final String ADD_DEL_SPAN = "<span class=\"%s\" data-title=\"%s\">";
    private static final String UPD_SPAN = "<span class=\"cupd\">";
    private static final String ID_SPAN = "<span class=\"marker\" id=\"mapping-%d\"></span>";
    private static final String END_SPAN = "</span>";

    private String srcDiff;

    private String dstDiff;

    private File fSrc;

    private File fDst;

    private Tree src;

    private Tree dst;

    private MappingStore mappings;

    public HtmlDiffs(File fSrc, File fDst, Tree src, Tree dst, MappingStore mappings) {
        this.fSrc = fSrc;
        this.fDst = fDst;
        this.src = src;
        this.dst = dst;
        this.mappings = mappings;
    }

    public void produce() throws IOException {
        TreeClassifier c = new RootAndLeavesClassifier(src, dst, mappings);
        TIntIntMap mappingIds = new TIntIntHashMap();

        int uId = 1;
        int mId = 1;

        TagIndex ltags = new TagIndex();
        for (Tree t: src.preOrder()) {
            if (c.getSrcMvTrees().contains(t)) {
                mappingIds.put(mappings.getDst(t).dfsIndex, mId);
                ltags.addStartTag(t.startPos, String.format(ID_SPAN, uId++));
                ltags.addTags(t.startPos, String.format(
                                SRC_MV_SPAN, "token mv", mId++, tooltip(t)), t.endPos, END_SPAN);
            }
            if (c.getSrcUpdTrees().contains(t)) {
                mappingIds.put(mappings.getDst(t).dfsIndex, mId);
                ltags.addStartTag(t.startPos, String.format(ID_SPAN, uId++));
                ltags.addTags(t.startPos, String.format(
                                SRC_MV_SPAN, "token upd", mId++, tooltip(t)), t.endPos, END_SPAN);
                List<int[]> hunks = StringAlgorithms.hunks(t.name, mappings.getDst(t).name);
                for (int[] hunk: hunks)
                    ltags.addTags(t.startPos + hunk[0], UPD_SPAN, t.startPos + hunk[1], END_SPAN);

            }
            if (c.getSrcDelTrees().contains(t)) {
                ltags.addStartTag(t.startPos, String.format(ID_SPAN, uId++));
                ltags.addTags(t.startPos, String.format(
                                ADD_DEL_SPAN, "token del", tooltip(t)), t.endPos, END_SPAN);
            }
        }

        TagIndex rtags = new TagIndex();
        for (Tree t: dst.preOrder()) {
            if (c.getDstMvTrees().contains(t)) {
                int dId = mappingIds.get(t.dfsIndex);
                rtags.addStartTag(t.startPos, String.format(ID_SPAN, uId++));
                rtags.addTags(t.startPos, String.format(
                                DST_MV_SPAN, "token mv", dId, tooltip(t)), t.endPos, END_SPAN);
            }
            if (c.getDstUpdTrees().contains(t)) {
                int dId = mappingIds.get(t.dfsIndex);
                rtags.addStartTag(t.startPos, String.format(ID_SPAN, uId++));
                rtags.addTags(t.startPos, String.format(
                                DST_MV_SPAN, "token upd", dId, tooltip(t)), t.endPos, END_SPAN);
                List<int[]> hunks = StringAlgorithms.hunks(mappings.getSrc(t).name, t.name);
                for (int[] hunk: hunks)
                    rtags.addTags(t.startPos + hunk[2], UPD_SPAN, t.startPos + hunk[3], END_SPAN);
            }
            if (c.getDstAddTrees().contains(t)) {
                rtags.addStartTag(t.startPos, String.format(ID_SPAN, uId++));
                rtags.addTags(t.startPos, String.format(
                                ADD_DEL_SPAN, "token add", tooltip(t)), t.endPos, END_SPAN);
            }
        }

        StringWriter w1 = new StringWriter();
        BufferedReader r = Files.newBufferedReader(fSrc.toPath(), Charset.forName("UTF-8"));
        int cursor = 0;

        while (r.ready()) {
            char cr = (char) r.read();
            w1.append(ltags.getEndTags(cursor));
            w1.append(ltags.getStartTags(cursor));
            append(cr, w1);
            cursor++;
        }
        w1.append(ltags.getEndTags(cursor));
        r.close();
        srcDiff = w1.toString();

        StringWriter w2 = new StringWriter();
        r = Files.newBufferedReader(fDst.toPath(), Charset.forName("UTF-8"));
        cursor = 0;

        while (r.ready()) {
            char cr = (char) r.read();
            w2.append(rtags.getEndTags(cursor));
            w2.append(rtags.getStartTags(cursor));
            append(cr, w2);
            cursor++;
        }
        w2.append(rtags.getEndTags(cursor));
        r.close();

        dstDiff = w2.toString();
    }

    public String getSrcDiff() {
        return srcDiff;
    }

    public String getDstDiff() {
        return dstDiff;
    }

    private static String tooltip(Tree t) {
        return (t.parent != null)
                ? t.parent.name + "/" + t.name
                : t.name;
    }

    private static void append(char cr, Writer w) throws IOException {
        if (cr == '<') w.append("&lt;");
        else if (cr == '>') w.append("&gt;");
        else if (cr == '&') w.append("&amp;");
        else w.append(cr);
    }
}
