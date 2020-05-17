package com.sujah.builder.myprojectcode;

public class Patient {
    private final int id;
    private final String name;
    private final double salary;
    private final String specialization;

    public Patient(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.salary = builder.salary;
        this.specialization = builder.specialization;
    }

    static class Builder{
        private int id;
        private String name;
        private double salary;
        private String specialization;

        public Builder(int id) {
            this.id = id;
        }

        public Builder nameMethod(String name){
            this.name = name;
            return this;
        }

        public Builder salaryMethod(double salary){
            this.salary = salary;
            return this;
        }

        public  Builder specializationMethod(String specialization){
            this.specialization = specialization;
            return this;
        }

        public Patient building(){
            return new Patient(this);
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
