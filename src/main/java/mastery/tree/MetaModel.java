package mastery.tree;

import com.github.javaparser.metamodel.PropertyMetaModel;

import java.util.Set;

/**
 * A complete list of NodeList properties.
 * Format: [PropertyName: PropertyClass @ NodeClass]
 * <ul>
 * <li>annotations: AnnotationExpr @ ArrayCreationLevel</li>
 * <li>annotations: AnnotationExpr @ BodyDeclaration</li>
 * <li>annotations: AnnotationExpr @ ModuleDeclaration</li>
 * <li>annotations: AnnotationExpr @ PackageDeclaration</li>
 * <li>annotations: AnnotationExpr @ Parameter</li>
 * <li>annotations: AnnotationExpr @ ReceiverParameter</li>
 * <li>annotations: AnnotationExpr @ Type</li>
 * <li>annotations: AnnotationExpr @ VariableDeclarationExpr</li>
 * <li>anonymousClassBody: BodyDeclaration @ ObjectCreationExpr</li>
 * <li>arguments: Expression @ EnumConstantDeclaration</li>
 * <li>arguments: Expression @ ExplicitConstructorInvocationStmt</li>
 * <li>arguments: Expression @ MethodCallExpr</li>
 * <li>arguments: Expression @ ObjectCreationExpr</li>
 * <li>catchClauses: CatchClause @ TryStmt</li>
 * <li>classBody: BodyDeclaration @ EnumConstantDeclaration</li>
 * <li>directives: ModuleDirective @ ModuleDeclaration</li>
 * <li>elements: ReferenceType @ IntersectionType</li>
 * <li>elements: ReferenceType @ UnionType</li>
 * <li>entries: EnumConstantDeclaration @ EnumDeclaration</li>
 * <li>entries: SwitchEntry @ SwitchExpr</li>
 * <li>entries: SwitchEntry @ SwitchStmt</li>
 * <li>extendedTypes: ClassOrInterfaceType @ ClassOrInterfaceDeclaration</li>
 * <li>implementedTypes: ClassOrInterfaceType @ ClassOrInterfaceDeclaration</li>
 * <li>implementedTypes: ClassOrInterfaceType @ EnumDeclaration</li>
 * <li>implementedTypes: ClassOrInterfaceType @ RecordDeclaration</li>
 * <li>imports: ImportDeclaration @ CompilationUnit</li>
 * <li>initialization: Expression @ ForStmt</li>
 * <li>labels: Expression @ SwitchEntry</li>
 * <li>levels: ArrayCreationLevel @ ArrayCreationExpr</li>
 * <li>members: BodyDeclaration @ TypeDeclaration</li>
 * <li>modifiers: Modifier @ AnnotationMemberDeclaration</li>
 * <li>modifiers: Modifier @ CallableDeclaration</li>
 * <li>modifiers: Modifier @ CompactConstructorDeclaration</li>
 * <li>modifiers: Modifier @ FieldDeclaration</li>
 * <li>modifiers: Modifier @ ModuleRequiresDirective</li>
 * <li>modifiers: Modifier @ Parameter</li>
 * <li>modifiers: Modifier @ TypeDeclaration</li>
 * <li>modifiers: Modifier @ VariableDeclarationExpr</li>
 * <li>moduleNames: Name @ ModuleExportsDirective</li>
 * <li>moduleNames: Name @ ModuleOpensDirective</li>
 * <li>pairs: MemberValuePair @ NormalAnnotationExpr</li>
 * <li>parameters: Parameter @ CallableDeclaration</li>
 * <li>parameters: Parameter @ LambdaExpr</li>
 * <li>parameters: Parameter @ RecordDeclaration</li>
 * <li>resources: Expression @ TryStmt</li>
 * <li>statements: Statement @ BlockStmt</li>
 * <li>statements: Statement @ SwitchEntry</li>
 * <li>thrownExceptions: ReferenceType @ CallableDeclaration</li>
 * <li>thrownExceptions: ReferenceType @ CompactConstructorDeclaration</li>
 * <li>typeArguments: Type @ ClassOrInterfaceType</li>
 * <li>typeArguments: Type @ ExplicitConstructorInvocationStmt</li>
 * <li>typeArguments: Type @ FieldAccessExpr</li>
 * <li>typeArguments: Type @ MethodCallExpr</li>
 * <li>typeArguments: Type @ MethodReferenceExpr</li>
 * <li>typeArguments: Type @ ObjectCreationExpr</li>
 * <li>typeBound: ClassOrInterfaceType @ TypeParameter</li>
 * <li>typeParameters: TypeParameter @ CallableDeclaration</li>
 * <li>typeParameters: TypeParameter @ ClassOrInterfaceDeclaration</li>
 * <li>typeParameters: TypeParameter @ CompactConstructorDeclaration</li>
 * <li>typeParameters: TypeParameter @ RecordDeclaration</li>
 * <li>types: TypeDeclaration @ CompilationUnit</li>
 * <li>update: Expression @ ForStmt</li>
 * <li>values: Expression @ ArrayInitializerExpr</li>
 * <li>varArgsAnnotations: AnnotationExpr @ Parameter</li>
 * <li>variables: VariableDeclarator @ FieldDeclaration</li>
 * <li>variables: VariableDeclarator @ VariableDeclarationExpr</li>
 * <li>with: Name @ ModuleProvidesDirective</li>
 * </ul>
 */

public class MetaModel {
    public static final Set<String> ORDERED_LIST_PROPERTIES = Set.of(
        "arguments",
        "catchClauses",
        "entries",
        "initialization",
        "labels",
        "levels",
        "parameters",
        "resources",
        "statements",
        "thrownExceptions",
        "typeArguments",
        "typeParameters",
        "update",
        "values",
        "variables"
    );

    public static boolean isOrderedList(PropertyMetaModel property) {
        return ORDERED_LIST_PROPERTIES.contains(property.getName());
    }
}
