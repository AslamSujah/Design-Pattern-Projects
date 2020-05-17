package com.sujah.prototype.myprojectcode;

public class Pharmacist extends Employee {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pharmacist{" +
                "type='" + type + '\'' +
                '}';
    }
}
