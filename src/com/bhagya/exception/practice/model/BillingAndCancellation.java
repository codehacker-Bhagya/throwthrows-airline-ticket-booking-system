package com.bhagya.exception.practice.model;

public class BillingAndCancellation {
    private String PaymentMethod;
    private int Upiid;

    @Override
    public String toString() {
        return "BillingAndCancellation{" +
                "PaymentMethod='" + PaymentMethod + '\'' +
                ", Upiid=" + Upiid +
                '}';
    }

    public int getUpiid() {
        return Upiid;
    }

    public void setUpiid(int upiid) {
        Upiid = upiid;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }
}
