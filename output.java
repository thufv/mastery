package org.antlr.v4.runtime.tree.pattern;
///// left
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
///// right
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
/////
public
class TokenTagToken extends CommonToken {
public
  TokenTagToken(String tokenName, int type) { this(tokenName, type, null); }
public
  @Override String getText() {
    if (label != null) {
      return "<" + label + ":" + tokenName + ">";
    }
    return "<" + tokenName + ">";
  }
public
  @Override String toString() {
    return tokenName + ":" + type;
  }
private
  final String tokenName;
private
  final String label;
public
  TokenTagToken(String tokenName, int type, String label) {
    super(type);
    this.tokenName = tokenName;
    this.label = label;
  }
public
  final String getTokenName() { return tokenName; }
public
  final String getLabel() { return label; }
}
