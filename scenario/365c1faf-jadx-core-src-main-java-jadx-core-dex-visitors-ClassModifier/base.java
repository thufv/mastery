class ClassModifier {

    boolean visit() {
        removeSyntheticFields(cls);
        cls.getMethods().forEach(mth -> removeSyntheticMethods(cls, mth));
        markAnonymousClass(cls);
    }
}