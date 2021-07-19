package mastery;

import mastery.driver.Driver;

public class Main {
    public static void main(String[] args) {
//        String code = "int[] a[][]=new int[5][5][];";
//        var cu = StaticJavaParser.parseStatement(code);
//        System.out.println(cu.toString());
//        ASTParser parser = ASTParser.newParser(AST.JLS8);
//        parser.setKind(ASTParser.K_STATEMENTS);
//        parser.setSource(code.toCharArray());
//        Object cu = parser.createAST(null);
        Driver.fromCLI(args);
    }
}
