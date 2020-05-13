package com.sujah.FactoryMethod.examplecode;

public class Application {
    public static void main(String[] args) {
        Package package1 = PackageFactory.provideCreatedPackage(PackageCode.BASIC);
        System.out.println(package1);

        Package package2 = PackageFactory.provideCreatedPackage(PackageCode.PLATINUM);
        System.out.println(package2);
    }
}
