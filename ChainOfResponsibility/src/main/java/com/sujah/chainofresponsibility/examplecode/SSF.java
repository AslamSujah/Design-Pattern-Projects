package com.sujah.chainofresponsibility.examplecode;

public class SSF extends Handler {

    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax() + invoice.getAmount()*0.04);
        System.out.println("SSF Calculated");
        return invoice.getTax();
    }

}
