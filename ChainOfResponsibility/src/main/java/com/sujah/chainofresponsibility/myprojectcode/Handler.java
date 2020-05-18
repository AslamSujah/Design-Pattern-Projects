package com.sujah.chainofresponsibility.myprojectcode;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract double applyCalculation(ElectricityBill electricityBill);

    /* Unit Charges

    1-60 units 10.0
    61-120 units 20.0
    121-180 units 30.0
    >180 units 50.0

    */

}
