package com.sujah.FactoryMethod.myprojectcode;

public class DiabeticPatient extends PatientType {
    protected void createTreatments() {
        medicalTests.add(new HeartbeatTest());
        medicalTests.add(new BloodPressureTest());
        medicalTests.add(new BloodSugarTest());
    }
}
