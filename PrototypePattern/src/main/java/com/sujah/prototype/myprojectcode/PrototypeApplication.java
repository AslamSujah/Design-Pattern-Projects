package com.sujah.prototype.myprojectcode;

public class PrototypeApplication {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Doctor doctor1 = (Doctor) registry.getEmployeeType(EmployeeType.DOCTOR);
        System.out.println(doctor1);

        doctor1.setSpecialization("Skin");
        System.out.println(doctor1);

        Doctor doctor2 = (Doctor) registry.getEmployeeType(EmployeeType.DOCTOR);
        System.out.println(doctor2);


    }
}
