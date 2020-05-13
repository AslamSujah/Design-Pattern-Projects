package com.sujah.FactoryMethod.myprojectcode;

public class FactoryMethodApplication {
    public static void main(String[] args) {

        PatientType treatment1 = TreatmentFactory.provideCreatedTreatments(PatientCode.NORMAL);
        System.out.println(treatment1);

        PatientType treatment2 = TreatmentFactory.provideCreatedTreatments(PatientCode.ICU);
        System.out.println(treatment2);

    }
}
