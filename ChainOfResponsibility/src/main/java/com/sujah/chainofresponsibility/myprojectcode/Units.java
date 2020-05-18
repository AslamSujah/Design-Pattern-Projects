package com.sujah.chainofresponsibility.myprojectcode;

public class Units extends Handler {

    public double applyCalculation(ElectricityBill electricityBill) {
        return successor.applyCalculation(electricityBill);
    }

}
