package com.bhagya.exception.practice.exception;

public class InvalidPaymentMethod extends RuntimeException{
    public InvalidPaymentMethod(String message){
        super (message);
    }

}
