package com.sujah.chainofresponsibility.examplecode;

public class VAT extends Handler {

    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax() + invoice.getAmount()*0.01);
        System.out.println("VAT Calculated");
        if (invoice.getAmount() <= 100){
            return invoice.getTax();
        }
        else {
            return successor.applyTax(invoice);
        }
    }

}
