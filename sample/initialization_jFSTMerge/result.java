public class Test {
  static String _name;
  static public void printNamt() { System.out.println(_name); }
  static public void main(String[] args) { printName(); }
  static { _name = "Bob"; }
  static { _name = "Maria"; }
}
