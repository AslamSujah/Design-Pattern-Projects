package com.sujah.chainofresponsibility.myprojectcode;

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {

        Units units = new Units();
        Units1_60 units1_60 = new Units1_60();
        Units61_120 units61_120 = new Units61_120();
        Units121_180 units121_180 = new Units121_180();
        Units180Plus units180Plus = new Units180Plus();

        units.setSuccessor(units1_60);
        units1_60.setSuccessor(units61_120);
        units61_120.setSuccessor(units121_180);
        units121_180.setSuccessor(units180Plus);

        ElectricityBill electricityBill1 = new ElectricityBill(1001, 50);
        System.out.println("No of Units: " +electricityBill1.getUnits()+" Total Amount: " +units.applyCalculation(electricityBill1));

        ElectricityBill electricityBill2 = new ElectricityBill(1002,80);
        System.out.println("No of Units: " +electricityBill2.getUnits()+" Total Amount: " +units.applyCalculation(electricityBill2));

        ElectricityBill electricityBill3 = new ElectricityBill(1003, 150);
        System.out.println("No of Units: " +electricityBill3.getUnits()+" Total Amount: " +units.applyCalculation(electricityBill3));

        ElectricityBill electricityBill4 = new ElectricityBill(1004, 200);
        System.out.println("No of Units: " +electricityBill4.getUnits()+" Total Amount: " +units.applyCalculation(electricityBill4));

        ElectricityBill electricityBill5 = new ElectricityBill(1005, 250);
        System.out.println("No of Units: " +electricityBill5.getUnits()+" Total Amount: " +units.applyCalculation(electricityBill5));

    }
}
