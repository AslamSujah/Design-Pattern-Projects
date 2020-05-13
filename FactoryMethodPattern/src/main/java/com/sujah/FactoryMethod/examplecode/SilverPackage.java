package com.sujah.FactoryMethod.examplecode;

public class SilverPackage extends Package {
    protected void createPackage() {
        decorations.add(new BridalDeco());
        decorations.add(new BridesmaidDeco());
    }
}
