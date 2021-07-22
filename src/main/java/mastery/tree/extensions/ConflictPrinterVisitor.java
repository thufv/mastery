package mastery.tree.extensions;

import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.modules.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.type.*;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.printer.DefaultPrettyPrinterVisitor;
import com.github.javaparser.printer.configuration.PrinterConfiguration;
import mastery.util.Pair;

import static mastery.tree.extensions.ConflictWrapper.CONFLICT_KEY;

public class ConflictPrinterVisitor extends DefaultPrettyPrinterVisitor {
    private final Pair<String, String> files;

    public ConflictPrinterVisitor(PrinterConfiguration configuration, Pair<String, String> files) {
        super(configuration);
        this.files = files;
    }

    boolean visitAsConflict(Node n) {
        if (!n.containsData(CONFLICT_KEY)) {
            return false;
        }
        ConflictWrapper conflict = n.getData(CONFLICT_KEY);
        printer.print("\n<<<<<<< ").print(files.first).print("\n");
        for (Visitable node : conflict.left) {
            node.accept(this, null);
        }
        printer.print("\n=======\n");
        for (Visitable node : conflict.right) {
            node.accept(this, null);
        }
        printer.print("\n>>>>>>> ").print(files.second).print("\n");
        return true;
    }

    boolean visitAsConflict(NodeList<?> n) {
        return false;
    }

    @Override
    public void visit(NodeList n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(AnnotationDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(AnnotationMemberDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ArrayAccessExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ArrayCreationExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ArrayCreationLevel n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ArrayInitializerExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ArrayType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(AssertStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(AssignExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(BinaryExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(BlockComment n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(BlockStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(BooleanLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(BreakStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(CastExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(CatchClause n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(CharLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ClassExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ClassOrInterfaceType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(CompilationUnit n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ConditionalExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ConstructorDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ContinueStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(DoStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(DoubleLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(EmptyStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(EnclosedExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(EnumConstantDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(EnumDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ExplicitConstructorInvocationStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ExpressionStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(FieldAccessExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(FieldDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ForStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ForEachStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(IfStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ImportDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(InitializerDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(InstanceOfExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(IntegerLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(IntersectionType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(JavadocComment n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(LabeledStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(LambdaExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(LineComment n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(LocalClassDeclarationStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(LocalRecordDeclarationStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(LongLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(MarkerAnnotationExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(MemberValuePair n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(MethodCallExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(MethodDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(MethodReferenceExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(NameExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(Name n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(NormalAnnotationExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(NullLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ObjectCreationExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(PackageDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(Parameter n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(PrimitiveType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(RecordDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(CompactConstructorDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ReturnStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SimpleName n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SingleMemberAnnotationExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(StringLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SuperExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SwitchEntry n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SwitchStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SynchronizedStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ThisExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ThrowStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(TryStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(TypeExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(TypeParameter n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(UnaryExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(UnionType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(UnknownType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(VariableDeclarationExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(VariableDeclarator n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(VoidType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(WhileStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(WildcardType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ModuleDeclaration n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ModuleRequiresDirective n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ModuleExportsDirective n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ModuleProvidesDirective n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ModuleUsesDirective n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ModuleOpensDirective n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(UnparsableStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(ReceiverParameter n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(VarType n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(Modifier n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(SwitchExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(TextBlockLiteralExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(YieldStmt n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }

    @Override
    public void visit(PatternExpr n, Void arg) {
        if (!visitAsConflict(n)) {
            super.visit(n, arg);
        }
    }
}
