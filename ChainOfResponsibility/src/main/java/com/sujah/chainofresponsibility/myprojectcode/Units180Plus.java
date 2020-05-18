package com.sujah.chainofresponsibility.myprojectcode;

public class Units180Plus extends Handler {

    public double applyCalculation(ElectricityBill electricityBill) {
        electricityBill.setAmount(electricityBill.getAmount() + (electricityBill.getUnits()-180)*50);
        return electricityBill.getAmount();
    }
}
