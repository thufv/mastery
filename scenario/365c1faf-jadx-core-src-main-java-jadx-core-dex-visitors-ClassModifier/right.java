class ClassModifier {

    boolean visit() {
        markAnonymousClass(cls);
        removeSyntheticFields(cls);
        cls.getMethods().forEach(ClassModifier::removeSyntheticMethods);
    }
}