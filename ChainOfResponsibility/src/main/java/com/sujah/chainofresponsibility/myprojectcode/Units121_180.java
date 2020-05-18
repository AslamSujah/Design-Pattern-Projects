package com.sujah.chainofresponsibility.myprojectcode;

public class Units121_180 extends Handler {

    public double applyCalculation(ElectricityBill electricityBill) {
        if (electricityBill.getUnits() <= 180){
            electricityBill.setAmount(electricityBill.getAmount() + (electricityBill.getUnits()-120)*30);
        }
        else {
            electricityBill.setAmount(electricityBill.getAmount() + 60*30);
        }

        if (electricityBill.getUnits() <= 180){
            return electricityBill.getAmount();
        }
        else {
            return successor.applyCalculation(electricityBill);
        }
    }

}
