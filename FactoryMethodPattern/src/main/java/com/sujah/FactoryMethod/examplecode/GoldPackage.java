package com.sujah.FactoryMethod.examplecode;

public class GoldPackage extends Package {
    protected void createPackage() {
        decorations.add(new BridalDeco());
        decorations.add(new BridesmaidDeco());
        decorations.add(new ParentDeco());
    }
}
