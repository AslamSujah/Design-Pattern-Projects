package com.sujah.FactoryMethod.examplecode;

public class BasicPackage extends Package {
    protected void createPackage() {
        decorations.add(new BridalDeco());
    }
}
