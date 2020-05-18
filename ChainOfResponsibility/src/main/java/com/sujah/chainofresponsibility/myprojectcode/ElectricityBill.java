package com.sujah.chainofresponsibility.myprojectcode;

public class ElectricityBill {

    private int accountNumber;
    private int units;
    private double amount;

    public ElectricityBill(int accountNumber, int units) {
        this.accountNumber = accountNumber;
        this.units = units;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getUnits() {
        return units;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
