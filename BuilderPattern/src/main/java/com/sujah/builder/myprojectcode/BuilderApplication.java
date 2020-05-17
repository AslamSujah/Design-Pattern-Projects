package com.sujah.builder.myprojectcode;

public class BuilderApplication {
    public static void main(String[] args) {

        PatientTelescopic1 patientTelescopic1 = new PatientTelescopic1(1001);
        System.out.println(patientTelescopic1);

        PatientTelescopic2 patientTelescopic2 = new PatientTelescopic2(1001);
        System.out.println(patientTelescopic2);

        Patient.Builder builder = new Patient.Builder(1001);
        Patient patient1 = builder.nameMethod("Sujah").salaryMethod(75000).specializationMethod("SE").building();
        System.out.println(patient1);
    }
}
