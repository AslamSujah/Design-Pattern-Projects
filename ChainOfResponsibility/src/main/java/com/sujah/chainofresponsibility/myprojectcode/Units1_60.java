package com.sujah.chainofresponsibility.myprojectcode;

public class Units1_60 extends Handler {

    public double applyCalculation(ElectricityBill electricityBill) {
        if (electricityBill.getUnits() <= 60){
            electricityBill.setAmount(electricityBill.getAmount() + electricityBill.getUnits()*10);
        }
        else {
            electricityBill.setAmount(electricityBill.getAmount() + 60*10);
        }

        if (electricityBill.getUnits() <= 60){
            return electricityBill.getAmount();
        }
        else {
            return successor.applyCalculation(electricityBill);
        }
    }

}
