package com.sujah.FactoryMethod.examplecode;

public class PlatinumPackage extends Package {
    protected void createPackage() {
        decorations.add(new BridalDeco());
        decorations.add(new BridesmaidDeco());
        decorations.add(new ParentDeco());
        decorations.add(new FlowerGirlDeco());
    }
}
