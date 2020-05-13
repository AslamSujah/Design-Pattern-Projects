package com.sujah.FactoryMethod.myprojectcode;

public class NormalPatient extends PatientType {
    protected void createTreatments() {
        medicalTests.add(new HeartbeatTest());
        medicalTests.add(new BloodPressureTest());
    }
}
