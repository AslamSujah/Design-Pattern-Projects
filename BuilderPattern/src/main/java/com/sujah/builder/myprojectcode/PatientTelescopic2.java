package com.sujah.builder.myprojectcode;

public class PatientTelescopic2 {
    int id;
    String name;
    double salary;
    String specialization;

    public PatientTelescopic2(int id, String name, double salary, String specialization) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.specialization = specialization;
    }

    public PatientTelescopic2(int id, String name, double salary) {
        this(id, name, salary, null);
    }

    public PatientTelescopic2(int id, String name) {
        this(id, name, 0);
    }

    public PatientTelescopic2(int id) {
        this(id, null);
    }

    @Override
    public String toString() {
        return "PatientTelescopic2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
