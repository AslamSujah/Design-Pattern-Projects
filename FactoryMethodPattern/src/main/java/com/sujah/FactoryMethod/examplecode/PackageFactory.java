package com.sujah.FactoryMethod.examplecode;

public class PackageFactory {

    public static Package provideCreatedPackage(PackageCode packageCode){
        switch (packageCode){
            case BASIC:
                return new BasicPackage();
            case SILVER:
                return new SilverPackage();
            case GOLD:
                return new GoldPackage();
            case PLATINUM:
                return new PlatinumPackage();
            default:
                return null;
        }
    }

}
