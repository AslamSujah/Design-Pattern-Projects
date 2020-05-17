package com.sujah.builder.myprojectcode;

public class PatientTelescopic1 {
    int id;
    String name;
    double salary;
    String specialization;

    public PatientTelescopic1(int id) {
        this.id = id;
    }

    public PatientTelescopic1(int id, String name) {
        this(id);
        this.name = name;
    }

    public PatientTelescopic1(int id, String name, double salary) {
        this(id, name);
        this.salary = salary;
    }

    public PatientTelescopic1(int id, String name, double salary, String specialization) {
        this(id, name, salary);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "PatientTelescopic1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
