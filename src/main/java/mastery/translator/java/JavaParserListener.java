package mastery.translator.java;

// Generated from JavaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionPackageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOptionPackageDeclaration(JavaParser.OptionPackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionPackageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOptionPackageDeclaration(JavaParser.OptionPackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclarations(JavaParser.ImportDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclarations(JavaParser.ImportDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarations(JavaParser.TypeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarations(JavaParser.TypeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(JavaParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(JavaParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiers(JavaParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiers(JavaParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JavaParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JavaParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(JavaParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(JavaParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptionTypeParameters(JavaParser.OptionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptionTypeParameters(JavaParser.OptionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionExtendsTypeType}.
	 * @param ctx the parse tree
	 */
	void enterOptionExtendsTypeType(JavaParser.OptionExtendsTypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionExtendsTypeType}.
	 * @param ctx the parse tree
	 */
	void exitOptionExtendsTypeType(JavaParser.OptionExtendsTypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#extendsTypeType}.
	 * @param ctx the parse tree
	 */
	void enterExtendsTypeType(JavaParser.ExtendsTypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extendsTypeType}.
	 * @param ctx the parse tree
	 */
	void exitExtendsTypeType(JavaParser.ExtendsTypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionImplementsTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOptionImplementsTypeList(JavaParser.OptionImplementsTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionImplementsTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOptionImplementsTypeList(JavaParser.OptionImplementsTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#implementsTypeList}.
	 * @param ctx the parse tree
	 */
	void enterImplementsTypeList(JavaParser.ImplementsTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#implementsTypeList}.
	 * @param ctx the parse tree
	 */
	void exitImplementsTypeList(JavaParser.ImplementsTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterOtherTypeParameters(JavaParser.OtherTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitOtherTypeParameters(JavaParser.OtherTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnotherTypeParameter(JavaParser.AnotherTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnotherTypeParameter(JavaParser.AnotherTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionExtendsTypeBound}.
	 * @param ctx the parse tree
	 */
	void enterOptionExtendsTypeBound(JavaParser.OptionExtendsTypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionExtendsTypeBound}.
	 * @param ctx the parse tree
	 */
	void exitOptionExtendsTypeBound(JavaParser.OptionExtendsTypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#extendsTypeBound}.
	 * @param ctx the parse tree
	 */
	void enterExtendsTypeBound(JavaParser.ExtendsTypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extendsTypeBound}.
	 * @param ctx the parse tree
	 */
	void exitExtendsTypeBound(JavaParser.ExtendsTypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherTypeTypes}.
	 * @param ctx the parse tree
	 */
	void enterOtherTypeTypes(JavaParser.OtherTypeTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherTypeTypes}.
	 * @param ctx the parse tree
	 */
	void exitOtherTypeTypes(JavaParser.OtherTypeTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherTypeType}.
	 * @param ctx the parse tree
	 */
	void enterAnotherTypeType(JavaParser.AnotherTypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherTypeType}.
	 * @param ctx the parse tree
	 */
	void exitAnotherTypeType(JavaParser.AnotherTypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionEnumConstants}.
	 * @param ctx the parse tree
	 */
	void enterOptionEnumConstants(JavaParser.OptionEnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionEnumConstants}.
	 * @param ctx the parse tree
	 */
	void exitOptionEnumConstants(JavaParser.OptionEnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionEnumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterOptionEnumBodyDeclarations(JavaParser.OptionEnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionEnumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitOptionEnumBodyDeclarations(JavaParser.OptionEnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherEnumConstants}.
	 * @param ctx the parse tree
	 */
	void enterOtherEnumConstants(JavaParser.OtherEnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherEnumConstants}.
	 * @param ctx the parse tree
	 */
	void exitOtherEnumConstants(JavaParser.OtherEnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherEnumConstant}.
	 * @param ctx the parse tree
	 */
	void enterAnotherEnumConstant(JavaParser.AnotherEnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherEnumConstant}.
	 * @param ctx the parse tree
	 */
	void exitAnotherEnumConstant(JavaParser.AnotherEnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionArguments}.
	 * @param ctx the parse tree
	 */
	void enterOptionArguments(JavaParser.OptionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionArguments}.
	 * @param ctx the parse tree
	 */
	void exitOptionArguments(JavaParser.OptionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionClassBody}.
	 * @param ctx the parse tree
	 */
	void enterOptionClassBody(JavaParser.OptionClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionClassBody}.
	 * @param ctx the parse tree
	 */
	void exitOptionClassBody(JavaParser.OptionClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarations(JavaParser.ClassBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarations(JavaParser.ClassBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionExtendsTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOptionExtendsTypeList(JavaParser.OptionExtendsTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionExtendsTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOptionExtendsTypeList(JavaParser.OptionExtendsTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#extendsTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExtendsTypeList(JavaParser.ExtendsTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extendsTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExtendsTypeList(JavaParser.ExtendsTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclarations(JavaParser.InterfaceBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclarations(JavaParser.InterfaceBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionThrowsQualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterOptionThrowsQualifiedNameList(JavaParser.OptionThrowsQualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionThrowsQualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitOptionThrowsQualifiedNameList(JavaParser.OptionThrowsQualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#throwsQualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterThrowsQualifiedNameList(JavaParser.ThrowsQualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throwsQualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitThrowsQualifiedNameList(JavaParser.ThrowsQualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherConstantDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterOtherConstantDeclarators(JavaParser.OtherConstantDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherConstantDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitOtherConstantDeclarators(JavaParser.OtherConstantDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherConstantDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterAnotherConstantDeclarators(JavaParser.AnotherConstantDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherConstantDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitAnotherConstantDeclarators(JavaParser.AnotherConstantDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionTypeParametersAnnotations}.
	 * @param ctx the parse tree
	 */
	void enterOptionTypeParametersAnnotations(JavaParser.OptionTypeParametersAnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionTypeParametersAnnotations}.
	 * @param ctx the parse tree
	 */
	void exitOptionTypeParametersAnnotations(JavaParser.OptionTypeParametersAnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParametersAnnotations}.
	 * @param ctx the parse tree
	 */
	void enterTypeParametersAnnotations(JavaParser.TypeParametersAnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParametersAnnotations}.
	 * @param ctx the parse tree
	 */
	void exitTypeParametersAnnotations(JavaParser.TypeParametersAnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodModifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifiers(JavaParser.InterfaceMethodModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodModifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifiers(JavaParser.InterfaceMethodModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherVariableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterOtherVariableDeclarators(JavaParser.OtherVariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherVariableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitOtherVariableDeclarators(JavaParser.OtherVariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAnotherVariableDeclarator(JavaParser.AnotherVariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAnotherVariableDeclarator(JavaParser.AnotherVariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionEqualsVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterOptionEqualsVariableInitializer(JavaParser.OptionEqualsVariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionEqualsVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitOptionEqualsVariableInitializer(JavaParser.OptionEqualsVariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#equalsVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterEqualsVariableInitializer(JavaParser.EqualsVariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#equalsVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitEqualsVariableInitializer(JavaParser.EqualsVariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionVariablesInitializer}.
	 * @param ctx the parse tree
	 */
	void enterOptionVariablesInitializer(JavaParser.OptionVariablesInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionVariablesInitializer}.
	 * @param ctx the parse tree
	 */
	void exitOptionVariablesInitializer(JavaParser.OptionVariablesInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variablesInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariablesInitializer(JavaParser.VariablesInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variablesInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariablesInitializer(JavaParser.VariablesInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherVariableInitializers}.
	 * @param ctx the parse tree
	 */
	void enterOtherVariableInitializers(JavaParser.OtherVariableInitializersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherVariableInitializers}.
	 * @param ctx the parse tree
	 */
	void exitOtherVariableInitializers(JavaParser.OtherVariableInitializersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnotherVariableInitializer(JavaParser.AnotherVariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherVariableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnotherVariableInitializer(JavaParser.AnotherVariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterOptionTypeArguments(JavaParser.OptionTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitOptionTypeArguments(JavaParser.OptionTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#memberSelections}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelections(JavaParser.MemberSelectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#memberSelections}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelections(JavaParser.MemberSelectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#memberSelection}.
	 * @param ctx the parse tree
	 */
	void enterMemberSelection(JavaParser.MemberSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#memberSelection}.
	 * @param ctx the parse tree
	 */
	void exitMemberSelection(JavaParser.MemberSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionExtendsOrSuperTypeType}.
	 * @param ctx the parse tree
	 */
	void enterOptionExtendsOrSuperTypeType(JavaParser.OptionExtendsOrSuperTypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionExtendsOrSuperTypeType}.
	 * @param ctx the parse tree
	 */
	void exitOptionExtendsOrSuperTypeType(JavaParser.OptionExtendsOrSuperTypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherQualifiedNames}.
	 * @param ctx the parse tree
	 */
	void enterOtherQualifiedNames(JavaParser.OtherQualifiedNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherQualifiedNames}.
	 * @param ctx the parse tree
	 */
	void exitOtherQualifiedNames(JavaParser.OtherQualifiedNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAnotherQualifiedName(JavaParser.AnotherQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAnotherQualifiedName(JavaParser.AnotherQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterOptionFormalParameterList(JavaParser.OptionFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitOptionFormalParameterList(JavaParser.OptionFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#moreThanOneNonArrayFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterMoreThanOneNonArrayFormalParameters(JavaParser.MoreThanOneNonArrayFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#moreThanOneNonArrayFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitMoreThanOneNonArrayFormalParameters(JavaParser.MoreThanOneNonArrayFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterOtherFormalParameters(JavaParser.OtherFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitOtherFormalParameters(JavaParser.OtherFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnotherFormalParameter(JavaParser.AnotherFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnotherFormalParameter(JavaParser.AnotherFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionCommaArrayFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionCommaArrayFormalParameter(JavaParser.OptionCommaArrayFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionCommaArrayFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionCommaArrayFormalParameter(JavaParser.OptionCommaArrayFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#commaArrayFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCommaArrayFormalParameter(JavaParser.CommaArrayFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#commaArrayFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCommaArrayFormalParameter(JavaParser.CommaArrayFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterArrayFormalParameter(JavaParser.ArrayFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitArrayFormalParameter(JavaParser.ArrayFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherDotIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterOtherDotIdentifiers(JavaParser.OtherDotIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherDotIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitOtherDotIdentifiers(JavaParser.OtherDotIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherDotIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAnotherDotIdentifier(JavaParser.AnotherDotIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherDotIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAnotherDotIdentifier(JavaParser.AnotherDotIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JavaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JavaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionAnnotationRest}.
	 * @param ctx the parse tree
	 */
	void enterOptionAnnotationRest(JavaParser.OptionAnnotationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionAnnotationRest}.
	 * @param ctx the parse tree
	 */
	void exitOptionAnnotationRest(JavaParser.OptionAnnotationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationRest(JavaParser.AnnotationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationRest(JavaParser.AnnotationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionElementValuePairsOrElementValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionElementValuePairsOrElementValue(JavaParser.OptionElementValuePairsOrElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionElementValuePairsOrElementValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionElementValuePairsOrElementValue(JavaParser.OptionElementValuePairsOrElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePairsOrElementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairsOrElementValue(JavaParser.ElementValuePairsOrElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePairsOrElementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairsOrElementValue(JavaParser.ElementValuePairsOrElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherElementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterOtherElementValuePairs(JavaParser.OtherElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherElementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitOtherElementValuePairs(JavaParser.OtherElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherElementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterAnotherElementValuePair(JavaParser.AnotherElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherElementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitAnotherElementValuePair(JavaParser.AnotherElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherElementValues}.
	 * @param ctx the parse tree
	 */
	void enterOtherElementValues(JavaParser.OtherElementValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherElementValues}.
	 * @param ctx the parse tree
	 */
	void exitOtherElementValues(JavaParser.OtherElementValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherElementValue}.
	 * @param ctx the parse tree
	 */
	void enterAnotherElementValue(JavaParser.AnotherElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherElementValue}.
	 * @param ctx the parse tree
	 */
	void exitAnotherElementValue(JavaParser.AnotherElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionElementValues}.
	 * @param ctx the parse tree
	 */
	void enterOptionElementValues(JavaParser.OptionElementValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionElementValues}.
	 * @param ctx the parse tree
	 */
	void exitOptionElementValues(JavaParser.OptionElementValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValues}.
	 * @param ctx the parse tree
	 */
	void enterElementValues(JavaParser.ElementValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValues}.
	 * @param ctx the parse tree
	 */
	void exitElementValues(JavaParser.ElementValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclarations(JavaParser.AnnotationTypeElementDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclarations(JavaParser.AnnotationTypeElementDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionDefaultValue(JavaParser.OptionDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionDefaultValue(JavaParser.OptionDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(JavaParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(JavaParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(JavaParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(JavaParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JavaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JavaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(JavaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(JavaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JavaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JavaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(JavaParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(JavaParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(JavaParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(JavaParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tryRscSpecStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryRscSpecStmt(JavaParser.TryRscSpecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tryRscSpecStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryRscSpecStmt(JavaParser.TryRscSpecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(JavaParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(JavaParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#synchronizedStmt}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStmt(JavaParser.SynchronizedStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#synchronizedStmt}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStmt(JavaParser.SynchronizedStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JavaParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JavaParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#throwStmt}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmt(JavaParser.ThrowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throwStmt}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmt(JavaParser.ThrowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(JavaParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(JavaParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(JavaParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(JavaParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#semiStmt}.
	 * @param ctx the parse tree
	 */
	void enterSemiStmt(JavaParser.SemiStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#semiStmt}.
	 * @param ctx the parse tree
	 */
	void exitSemiStmt(JavaParser.SemiStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(JavaParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(JavaParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#identifierStmt}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierStmt(JavaParser.IdentifierStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#identifierStmt}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierStmt(JavaParser.IdentifierStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionColonExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionColonExpression(JavaParser.OptionColonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionColonExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionColonExpression(JavaParser.OptionColonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#colonExpression}.
	 * @param ctx the parse tree
	 */
	void enterColonExpression(JavaParser.ColonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#colonExpression}.
	 * @param ctx the parse tree
	 */
	void exitColonExpression(JavaParser.ColonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionElseStatement(JavaParser.OptionElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionElseStatement(JavaParser.OptionElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JavaParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JavaParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionFinallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterOptionFinallyBlock(JavaParser.OptionFinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionFinallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitOptionFinallyBlock(JavaParser.OptionFinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JavaParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JavaParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(JavaParser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(JavaParser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionExpression(JavaParser.OptionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionExpression(JavaParser.OptionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClausesOrOptionFinallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchClausesOrOptionFinallyBlock(JavaParser.CatchClausesOrOptionFinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClausesOrOptionFinallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchClausesOrOptionFinallyBlock(JavaParser.CatchClausesOrOptionFinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#orQualifiedNames}.
	 * @param ctx the parse tree
	 */
	void enterOrQualifiedNames(JavaParser.OrQualifiedNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#orQualifiedNames}.
	 * @param ctx the parse tree
	 */
	void exitOrQualifiedNames(JavaParser.OrQualifiedNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#orQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterOrQualifiedName(JavaParser.OrQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#orQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitOrQualifiedName(JavaParser.OrQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#semicolonResources}.
	 * @param ctx the parse tree
	 */
	void enterSemicolonResources(JavaParser.SemicolonResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#semicolonResources}.
	 * @param ctx the parse tree
	 */
	void exitSemicolonResources(JavaParser.SemicolonResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#semicolonResource}.
	 * @param ctx the parse tree
	 */
	void enterSemicolonResource(JavaParser.SemicolonResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#semicolonResource}.
	 * @param ctx the parse tree
	 */
	void exitSemicolonResource(JavaParser.SemicolonResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionforInit}.
	 * @param ctx the parse tree
	 */
	void enterOptionforInit(JavaParser.OptionforInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionforInit}.
	 * @param ctx the parse tree
	 */
	void exitOptionforInit(JavaParser.OptionforInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterOptionExpressionList(JavaParser.OptionExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitOptionExpressionList(JavaParser.OptionExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherExpressions}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpressions(JavaParser.OtherExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherExpressions}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpressions(JavaParser.OtherExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnotherExpression(JavaParser.AnotherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnotherExpression(JavaParser.AnotherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(JavaParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(JavaParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrExpr(JavaParser.LogicOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrExpr(JavaParser.LogicOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(JavaParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(JavaParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceOfExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpr(JavaParser.InstanceOfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceOfExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpr(JavaParser.InstanceOfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayReadExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayReadExpr(JavaParser.ArrayReadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayReadExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayReadExpr(JavaParser.ArrayReadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(JavaParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(JavaParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dottedExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDottedExpr(JavaParser.DottedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dottedExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDottedExpr(JavaParser.DottedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpr(JavaParser.XorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpr(JavaParser.XorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(JavaParser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(JavaParser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixAddMinusExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixAddMinusExpr(JavaParser.InfixAddMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixAddMinusExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixAddMinusExpr(JavaParser.InfixAddMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(JavaParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(JavaParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(JavaParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(JavaParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(JavaParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(JavaParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(JavaParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(JavaParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpr(JavaParser.TypedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpr(JavaParser.TypedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(JavaParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(JavaParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(JavaParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(JavaParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpr(JavaParser.BitAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpr(JavaParser.BitAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(JavaParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(JavaParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMethodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMethodReference(JavaParser.ExprMethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMethodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMethodReference(JavaParser.ExprMethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMethodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeMethodReference(JavaParser.TypeMethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMethodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeMethodReference(JavaParser.TypeMethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpr(JavaParser.ClassExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpr(JavaParser.ClassExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preAddMinusExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreAddMinusExpr(JavaParser.PreAddMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preAddMinusExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreAddMinusExpr(JavaParser.PreAddMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(JavaParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(JavaParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpr(JavaParser.SuperExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpr(JavaParser.SuperExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(JavaParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(JavaParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpr(JavaParser.BitOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpr(JavaParser.BitOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExpr(JavaParser.LogicAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExpr(JavaParser.LogicAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(JavaParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(JavaParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sufAddMinusExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSufAddMinusExpr(JavaParser.SufAddMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sufAddMinusExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSufAddMinusExpr(JavaParser.SufAddMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classTypeMethodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeMethodReference(JavaParser.ClassTypeMethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classTypeMethodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeMethodReference(JavaParser.ClassTypeMethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(JavaParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(JavaParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#thisArguments}.
	 * @param ctx the parse tree
	 */
	void enterThisArguments(JavaParser.ThisArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#thisArguments}.
	 * @param ctx the parse tree
	 */
	void exitThisArguments(JavaParser.ThisArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#newOptionNonWildcardTypeArgumentsInnerCreator}.
	 * @param ctx the parse tree
	 */
	void enterNewOptionNonWildcardTypeArgumentsInnerCreator(JavaParser.NewOptionNonWildcardTypeArgumentsInnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#newOptionNonWildcardTypeArgumentsInnerCreator}.
	 * @param ctx the parse tree
	 */
	void exitNewOptionNonWildcardTypeArgumentsInnerCreator(JavaParser.NewOptionNonWildcardTypeArgumentsInnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#superSuperSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuperSuffix(JavaParser.SuperSuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superSuperSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuperSuffix(JavaParser.SuperSuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionTypeArgumentsIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOptionTypeArgumentsIdentifier(JavaParser.OptionTypeArgumentsIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionTypeArgumentsIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOptionTypeArgumentsIdentifier(JavaParser.OptionTypeArgumentsIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#leftShift}.
	 * @param ctx the parse tree
	 */
	void enterLeftShift(JavaParser.LeftShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#leftShift}.
	 * @param ctx the parse tree
	 */
	void exitLeftShift(JavaParser.LeftShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#signedRightShift}.
	 * @param ctx the parse tree
	 */
	void enterSignedRightShift(JavaParser.SignedRightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#signedRightShift}.
	 * @param ctx the parse tree
	 */
	void exitSignedRightShift(JavaParser.SignedRightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unsignedRightShift}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedRightShift(JavaParser.UnsignedRightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unsignedRightShift}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedRightShift(JavaParser.UnsignedRightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionNonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterOptionNonWildcardTypeArguments(JavaParser.OptionNonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionNonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitOptionNonWildcardTypeArguments(JavaParser.OptionNonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#squaredExpression}.
	 * @param ctx the parse tree
	 */
	void enterSquaredExpression(JavaParser.SquaredExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#squaredExpression}.
	 * @param ctx the parse tree
	 */
	void exitSquaredExpression(JavaParser.SquaredExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(JavaParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(JavaParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterOtherIdentifiers(JavaParser.OtherIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitOtherIdentifiers(JavaParser.OtherIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAnotherIdentifier(JavaParser.AnotherIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAnotherIdentifier(JavaParser.AnotherIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parenthesizedOptionFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedOptionFormalParameterList(JavaParser.ParenthesizedOptionFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parenthesizedOptionFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedOptionFormalParameterList(JavaParser.ParenthesizedOptionFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parenthesizedIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedIdentifiers(JavaParser.ParenthesizedIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parenthesizedIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedIdentifiers(JavaParser.ParenthesizedIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionClassOrInterfaceTypeDot}.
	 * @param ctx the parse tree
	 */
	void enterOptionClassOrInterfaceTypeDot(JavaParser.OptionClassOrInterfaceTypeDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionClassOrInterfaceTypeDot}.
	 * @param ctx the parse tree
	 */
	void exitOptionClassOrInterfaceTypeDot(JavaParser.OptionClassOrInterfaceTypeDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceTypeDot}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeDot(JavaParser.ClassOrInterfaceTypeDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceTypeDot}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeDot(JavaParser.ClassOrInterfaceTypeDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceOrPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceOrPrimitiveType(JavaParser.ClassOrInterfaceOrPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceOrPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceOrPrimitiveType(JavaParser.ClassOrInterfaceOrPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionNonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterOptionNonWildcardTypeArgumentsOrDiamond(JavaParser.OptionNonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionNonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitOptionNonWildcardTypeArgumentsOrDiamond(JavaParser.OptionNonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#rightSquaredExpression}.
	 * @param ctx the parse tree
	 */
	void enterRightSquaredExpression(JavaParser.RightSquaredExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#rightSquaredExpression}.
	 * @param ctx the parse tree
	 */
	void exitRightSquaredExpression(JavaParser.RightSquaredExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#squaredExpressions}.
	 * @param ctx the parse tree
	 */
	void enterSquaredExpressions(JavaParser.SquaredExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#squaredExpressions}.
	 * @param ctx the parse tree
	 */
	void exitSquaredExpressions(JavaParser.SquaredExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#rightAssocBinaryOperatorAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterRightAssocBinaryOperatorAndExpression(JavaParser.RightAssocBinaryOperatorAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#rightAssocBinaryOperatorAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitRightAssocBinaryOperatorAndExpression(JavaParser.RightAssocBinaryOperatorAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#commaTypeTypes}.
	 * @param ctx the parse tree
	 */
	void enterCommaTypeTypes(JavaParser.CommaTypeTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#commaTypeTypes}.
	 * @param ctx the parse tree
	 */
	void exitCommaTypeTypes(JavaParser.CommaTypeTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#commaTypeType}.
	 * @param ctx the parse tree
	 */
	void enterCommaTypeType(JavaParser.CommaTypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#commaTypeType}.
	 * @param ctx the parse tree
	 */
	void exitCommaTypeType(JavaParser.CommaTypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterOptionAnnotation(JavaParser.OptionAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitOptionAnnotation(JavaParser.OptionAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionNonEmptyTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterOptionNonEmptyTypeArguments(JavaParser.OptionNonEmptyTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionNonEmptyTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitOptionNonEmptyTypeArguments(JavaParser.OptionNonEmptyTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#nonEmptyTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyTypeArguments(JavaParser.NonEmptyTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#nonEmptyTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyTypeArguments(JavaParser.NonEmptyTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterOtherTypeArguments(JavaParser.OtherTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitOtherTypeArguments(JavaParser.OtherTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#anotherTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterAnotherTypeArgument(JavaParser.AnotherTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#anotherTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitAnotherTypeArgument(JavaParser.AnotherTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#commaIdentifierOptionArguments}.
	 * @param ctx the parse tree
	 */
	void enterCommaIdentifierOptionArguments(JavaParser.CommaIdentifierOptionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#commaIdentifierOptionArguments}.
	 * @param ctx the parse tree
	 */
	void exitCommaIdentifierOptionArguments(JavaParser.CommaIdentifierOptionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionStatic}.
	 * @param ctx the parse tree
	 */
	void enterOptionStatic(JavaParser.OptionStaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionStatic}.
	 * @param ctx the parse tree
	 */
	void exitOptionStatic(JavaParser.OptionStaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionDotStar}.
	 * @param ctx the parse tree
	 */
	void enterOptionDotStar(JavaParser.OptionDotStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionDotStar}.
	 * @param ctx the parse tree
	 */
	void exitOptionDotStar(JavaParser.OptionDotStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dotStar}.
	 * @param ctx the parse tree
	 */
	void enterDotStar(JavaParser.DotStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dotStar}.
	 * @param ctx the parse tree
	 */
	void exitDotStar(JavaParser.DotStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionComma}.
	 * @param ctx the parse tree
	 */
	void enterOptionComma(JavaParser.OptionCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionComma}.
	 * @param ctx the parse tree
	 */
	void exitOptionComma(JavaParser.OptionCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#squares}.
	 * @param ctx the parse tree
	 */
	void enterSquares(JavaParser.SquaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#squares}.
	 * @param ctx the parse tree
	 */
	void exitSquares(JavaParser.SquaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#square}.
	 * @param ctx the parse tree
	 */
	void enterSquare(JavaParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#square}.
	 * @param ctx the parse tree
	 */
	void exitSquare(JavaParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterOptionSemicolon(JavaParser.OptionSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitOptionSemicolon(JavaParser.OptionSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#optionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOptionIdentifier(JavaParser.OptionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#optionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOptionIdentifier(JavaParser.OptionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterAngle(JavaParser.AngleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitAngle(JavaParser.AngleContext ctx);
}