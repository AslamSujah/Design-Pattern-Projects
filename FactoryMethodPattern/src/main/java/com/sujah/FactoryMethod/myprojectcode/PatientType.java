package com.sujah.FactoryMethod.myprojectcode;

import java.util.ArrayList;
import java.util.List;

public abstract class PatientType {

    protected List<MedicalTest> medicalTests = new ArrayList<MedicalTest>();

    public PatientType() {
        createTreatments();
    }

    protected abstract void createTreatments();

    @Override
    public String toString() {
        return "PatientType{Medical Tests=" + medicalTests + "}";
    }
}
