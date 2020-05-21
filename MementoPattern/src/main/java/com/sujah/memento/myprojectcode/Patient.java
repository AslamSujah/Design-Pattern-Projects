package com.sujah.memento.myprojectcode;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String contactNo;

    public Patient(int id, String name, int age, String contactNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
