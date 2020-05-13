package com.sujah.FactoryMethod.myprojectcode;

public class TreatmentFactory {

    public static PatientType provideCreatedTreatments(PatientCode patientCode){

        switch (patientCode){
            case NORMAL:
                return new NormalPatient();
            case DIABETIC:
                return new DiabeticPatient();
            case ICU:
                return new ICUPatient();
            default:
                return null;
        }

    }

}
