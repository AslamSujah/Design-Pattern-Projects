package com.sujah.FactoryMethod.myprojectcode;

public class ICUPatient extends PatientType {
    protected void createTreatments() {
        medicalTests.add(new HeartbeatTest());
        medicalTests.add(new BloodPressureTest());
        medicalTests.add(new BloodSugarTest());
        medicalTests.add(new CholesterolTest());
    }
}
