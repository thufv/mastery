package org.antlr.v4.runtime;
import org.antlr.v4.runtime.misc.Interval;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public
class TokenStreamRewriter {
public
  static final String DEFAULT_PROGRAM_NAME = "default";
public
  static final int PROGRAM_INIT_SIZE = 100;
public
  static final int MIN_TOKEN_INDEX = 0;
public
  class RewriteOperation {
  protected
    int instructionIndex;
  protected
    int index;
  protected
    Object text;
  protected
    RewriteOperation(int index) { this.index = index; }
  protected
    RewriteOperation(int index, Object text) {
      this.index = index;
      this.text = text;
    }
  public
    int execute(StringBuilder buf) { return index; }
    @Override public String toString() {
      String opName = getClass().getName();
      int $index = opName.indexOf('$');
      opName = opName.substring($index + 1, opName.length());
      return "<" + opName + "@" + tokens.get(index) + ":\"" + text + "\">";
    }
  } class InsertBeforeOp extends RewriteOperation {
  public
    InsertBeforeOp(int index, Object text) { super(index, text); }
    @Override public int execute(StringBuilder buf) {
      buf.append(text);
      if (tokens.get(index).getType() != Token.EOF) {
        buf.append(tokens.get(index).getText());
      }
      return index + 1;
    }
  } class ReplaceOp extends RewriteOperation {
  protected
    int lastIndex;
  public
    ReplaceOp(int from, int to, Object text) {
      super(from, text);
      lastIndex = to;
    }
    @Override public int execute(StringBuilder buf) {
      if (text != null) {
        buf.append(text);
      }
      return lastIndex + 1;
    }
    @Override public String toString() {
      if (text == null) {
        return "<DeleteOp@" + tokens.get(index) + ".." + tokens.get(lastIndex) +
               ">";
      }
      return "<ReplaceOp@" + tokens.get(index) + ".." + tokens.get(lastIndex) +
             ":\"" + text + "\">";
    }
  } final protected TokenStream tokens;
  final protected Map<String, List<RewriteOperation>> programs;
  final protected Map<String, Integer> lastRewriteTokenIndexes;
public
  TokenStreamRewriter(TokenStream tokens) {
    this.tokens = tokens;
    programs = new HashMap<String, List<RewriteOperation>>();
    programs.put(DEFAULT_PROGRAM_NAME,
                 new ArrayList<RewriteOperation>(PROGRAM_INIT_SIZE));
    lastRewriteTokenIndexes = new HashMap<String, Integer>();
  }
public
  final TokenStream getTokenStream() { return tokens; }
public
  void rollback(int instructionIndex) {
    rollback(DEFAULT_PROGRAM_NAME, instructionIndex);
  }
public
  void rollback(String programName, int instructionIndex) {
    List<RewriteOperation> is = programs.get(programName);
    if (is != null) {
      programs.put(programName, is.subList(MIN_TOKEN_INDEX, instructionIndex));
    }
  }
public
  void deleteProgram() { deleteProgram(DEFAULT_PROGRAM_NAME); }
public
  void deleteProgram(String programName) {
    rollback(programName, MIN_TOKEN_INDEX);
  }
public
  void insertAfter(Token t, Object text) {
    insertAfter(DEFAULT_PROGRAM_NAME, t, text);
  }
public
  void insertAfter(int index, Object text) {
    insertAfter(DEFAULT_PROGRAM_NAME, index, text);
  }
public
  void insertAfter(String programName, Token t, Object text) {
    insertAfter(programName, t.getTokenIndex(), text);
  }
public
  void insertBefore(Token t, Object text) {
    insertBefore(DEFAULT_PROGRAM_NAME, t, text);
  }
public
  void insertBefore(int index, Object text) {
    insertBefore(DEFAULT_PROGRAM_NAME, index, text);
  }
public
  void insertBefore(String programName, Token t, Object text) {
    insertBefore(programName, t.getTokenIndex(), text);
  }
public
  void insertBefore(String programName, int index, Object text) {
    RewriteOperation op = new InsertBeforeOp(index, text);
    List<RewriteOperation> rewrites = getProgram(programName);
    op.instructionIndex = rewrites.size();
    rewrites.add(op);
  }
public
  void replace(int index, Object text) {
    replace(DEFAULT_PROGRAM_NAME, index, index, text);
  }
public
  void replace(int from, int to, Object text) {
    replace(DEFAULT_PROGRAM_NAME, from, to, text);
  }
public
  void replace(Token indexT, Object text) {
    replace(DEFAULT_PROGRAM_NAME, indexT, indexT, text);
  }
public
  void replace(Token from, Token to, Object text) {
    replace(DEFAULT_PROGRAM_NAME, from, to, text);
  }
public
  void replace(String programName, int from, int to, Object text) {
    if (from > to || from < 0 || to < 0 || to >= tokens.size()) {
      throw new IllegalArgumentException("replace: range invalid: " + from +
                                         ".." + to + "(size=" + tokens.size() +
                                         ")");
    }
    RewriteOperation op = new ReplaceOp(from, to, text);
    List<RewriteOperation> rewrites = getProgram(programName);
    op.instructionIndex = rewrites.size();
    rewrites.add(op);
  }
public
  void replace(String programName, Token from, Token to, Object text) {
    replace(programName, from.getTokenIndex(), to.getTokenIndex(), text);
  }
public
  void delete (int index) { delete (DEFAULT_PROGRAM_NAME, index, index); }
public
  void delete (int from, int to) { delete (DEFAULT_PROGRAM_NAME, from, to); }
public
  void delete (Token indexT) { delete (DEFAULT_PROGRAM_NAME, indexT, indexT); }
public
  void delete (Token from, Token to) {
    delete (DEFAULT_PROGRAM_NAME, from, to);
  }
public
  void delete (String programName, int from, int to) {
    replace(programName, from, to, null);
  }
public
  void delete (String programName, Token from, Token to) {
    replace(programName, from, to, null);
  }
public
  int getLastRewriteTokenIndex() {
    return getLastRewriteTokenIndex(DEFAULT_PROGRAM_NAME);
  }
protected
  int getLastRewriteTokenIndex(String programName) {
    Integer I = lastRewriteTokenIndexes.get(programName);
    if (I == null) {
      return -1;
    }
    return I;
  }
protected
  void setLastRewriteTokenIndex(String programName, int i) {
    lastRewriteTokenIndexes.put(programName, i);
  }
protected
  List<RewriteOperation> getProgram(String name) {
    List<RewriteOperation> is = programs.get(name);
    if (is == null) {
      is = initializeProgram(name);
    }
    return is;
  }
private
  List<RewriteOperation> initializeProgram(String name) {
    List<RewriteOperation> is =
        new ArrayList<RewriteOperation>(PROGRAM_INIT_SIZE);
    programs.put(name, is);
    return is;
  }
public
  String getText() {
    return getText(DEFAULT_PROGRAM_NAME, Interval.of(0, tokens.size() - 1));
  }
public
  String getText(String programName) {
    return getText(programName, Interval.of(0, tokens.size() - 1));
  }
public
  String getText(Interval interval) {
    return getText(DEFAULT_PROGRAM_NAME, interval);
  }
public
  String getText(String programName, Interval interval) {
    List<RewriteOperation> rewrites = programs.get(programName);
    int start = interval.a;
    int stop = interval.b;
    if (stop > tokens.size() - 1)
      stop = tokens.size() - 1;
    if (start < 0)
      start = 0;
    if (rewrites == null || rewrites.isEmpty()) {
      return tokens.getText(interval);
    }
    StringBuilder buf = new StringBuilder();
    Map<Integer, RewriteOperation> indexToOp =
        reduceToSingleOperationPerIndex(rewrites);
    int i = start;
    while (i <= stop && i < tokens.size()) {
      RewriteOperation op = indexToOp.get(i);
      indexToOp.remove(i);
      Token t = tokens.get(i);
      if (op == null) {
        if (t.getType() != Token.EOF)
          buf.append(t.getText());
        i++;
      } else {
        i = op.execute(buf);
      }
    }
    if (stop == tokens.size() - 1) {
      for (RewriteOperation op : indexToOp.values()) {
        if (op.index >= tokens.size() - 1)
          buf.append(op.text);
      }
    }
    return buf.toString();
  }
protected
  Map<Integer, RewriteOperation>
  reduceToSingleOperationPerIndex(List<RewriteOperation> rewrites) {
    for (int i = 0; i < rewrites.size(); i++) {
      RewriteOperation op = rewrites.get(i);
      if (op == null)
        continue;
      if (!(op instanceof ReplaceOp))
        continue;
      ReplaceOp rop = (ReplaceOp)rewrites.get(i);
      List < ? extends InsertBeforeOp > inserts =
                   getKindOfOps(rewrites, InsertBeforeOp.class, i);
      for (InsertBeforeOp iop : inserts) {
        if (iop.index == rop.index) {
          rewrites.set(iop.instructionIndex, null);
          rop.text = iop.text.toString() +
                     (rop.text != null ? rop.text.toString() : "");
        } else if (iop.index > rop.index && iop.index <= rop.lastIndex) {
          rewrites.set(iop.instructionIndex, null);
        }
      }
      List < ? extends ReplaceOp > prevReplaces =
                   getKindOfOps(rewrites, ReplaceOp.class, i);
      for (ReplaceOp prevRop : prevReplaces) {
        if (prevRop.index >= rop.index && prevRop.lastIndex <= rop.lastIndex) {
          rewrites.set(prevRop.instructionIndex, null);
          continue;
        }
        boolean disjoint =
            prevRop.lastIndex < rop.index || prevRop.index > rop.lastIndex;
        if (prevRop.text == null && rop.text == null && !disjoint) {
          rewrites.set(prevRop.instructionIndex, null);
          rop.index = Math.min(prevRop.index, rop.index);
          rop.lastIndex = Math.max(prevRop.lastIndex, rop.lastIndex);
          System.out.println("new rop " + rop);
        } else if (!disjoint) {
          throw new IllegalArgumentException("replace op boundaries of " + rop +
                                             " overlap with previous " +
                                             prevRop);
        }
      }
    }
    for (int i = 0; i < rewrites.size(); i++) {
      RewriteOperation op = rewrites.get(i);
      if (op == null)
        continue;
      if (!(op instanceof InsertBeforeOp))
        continue;
      InsertBeforeOp iop = (InsertBeforeOp)rewrites.get(i);
      List < ? extends InsertBeforeOp > prevInserts =
                   getKindOfOps(rewrites, InsertBeforeOp.class, i);
      for (InsertBeforeOp prevIop : prevInserts) {
        if (prevIop.index == iop.index) {
          if (InsertAfterOp.class.isInstance(prevIop)) {
            iop.text = catOpText(prevIop.text, iop.text);
            rewrites.set(prevIop.instructionIndex, null);
          } else if (InsertBeforeOp.class.isInstance(prevIop)) {
            iop.text = catOpText(iop.text, prevIop.text);
            rewrites.set(prevIop.instructionIndex, null);
          }
        }
      }
      List < ? extends ReplaceOp > prevReplaces =
                   getKindOfOps(rewrites, ReplaceOp.class, i);
      for (ReplaceOp rop : prevReplaces) {
        if (iop.index == rop.index) {
          rop.text = catOpText(iop.text, rop.text);
          rewrites.set(i, null);
          continue;
        }
        if (iop.index >= rop.index && iop.index <= rop.lastIndex) {
          throw new IllegalArgumentException(
              "insert op " + iop + " within boundaries of previous " + rop);
        }
      }
    }
    Map<Integer, RewriteOperation> m = new HashMap<Integer, RewriteOperation>();
    for (int i = 0; i < rewrites.size(); i++) {
      RewriteOperation op = rewrites.get(i);
      if (op == null)
        continue;
      if (m.get(op.index) != null) {
        throw new Error("should only be one op per index");
      }
      m.put(op.index, op);
    }
    return m;
  }
protected
  String catOpText(Object a, Object b) {
    String x = "";
    String y = "";
    if (a != null)
      x = a.toString();
    if (b != null)
      y = b.toString();
    return x + y;
  }
protected
  <T extends RewriteOperation> List <
      ? extends T > getKindOfOps(
                        List < ? extends RewriteOperation > rewrites,
                        Class<T> kind, int before) {
    List<T> ops = new ArrayList<T>();
    for (int i = 0; i < before && i < rewrites.size(); i++) {
      RewriteOperation op = rewrites.get(i);
      if (op == null)
        continue;
      if (kind.isInstance(op)) {
        ops.add(kind.cast(op));
      }
    }
    return ops;
  }
  class InsertAfterOp extends InsertBeforeOp {
  public
    InsertAfterOp(int index, Object text) { super(index + 1, text); }
  } public void insertAfter(String programName, int index, Object text) {
    RewriteOperation op = new InsertAfterOp(index, text);
    List<RewriteOperation> rewrites = getProgram(programName);
    op.instructionIndex = rewrites.size();
    rewrites.add(op);
  }
}
