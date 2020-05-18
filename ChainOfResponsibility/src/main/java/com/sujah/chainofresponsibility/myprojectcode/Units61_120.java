package com.sujah.chainofresponsibility.myprojectcode;

public class Units61_120 extends Handler {

    public double applyCalculation(ElectricityBill electricityBill) {
        if (electricityBill.getUnits() <= 120){
            electricityBill.setAmount(electricityBill.getAmount() + (electricityBill.getUnits()-60)*20);
        }
        else {
            electricityBill.setAmount(electricityBill.getAmount() + 60*20);
        }

        if (electricityBill.getUnits() <= 120){
            return electricityBill.getAmount();
        }
        else {
            return successor.applyCalculation(electricityBill);
        }

    }

}
