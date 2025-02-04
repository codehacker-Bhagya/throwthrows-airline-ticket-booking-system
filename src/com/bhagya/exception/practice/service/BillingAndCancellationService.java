package com.bhagya.exception.practice.service;

import com.bhagya.exception.practice.model.BillingAndCancellation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BillingAndCancellationService {
    static HashMap<Integer, BillingAndCancellation> billingAndCancellationHashMap = new HashMap<Integer, BillingAndCancellation>();
    private static final Scanner scanner = new Scanner(System.in);
    int billIndex = 0;


    public void billingData(BillingAndCancellation billingAndCancellation) {
        System.out.println(BillingService());
    }


    public BillingAndCancellation BillingService() throws NumberFormatException {

        BillingAndCancellation billingAndCancellation = new BillingAndCancellation();


        System.out.println("Please Enter Your Payment Method");
        String MethodOfPayment = "online";
        try {
            String PaymentMethod = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Pls Enter valid input");
        }
        if (MethodOfPayment != "online") {
            System.out.println("Pls Fill the amount at next counter");
        } else {
            System.out.println("payment Successfull");
        }
        System.out.println("Enter Your upi id");
        int upiid = Integer.parseInt(scanner.nextLine());

        System.out.println("Thank You!!!");

        return BillingService();
    }

    public void displayBilling() {

        Set<Map.Entry<Integer, BillingAndCancellation>> entrySet = billingAndCancellationHashMap.entrySet();
        for (Map.Entry<Integer, BillingAndCancellation> billingAndCancellationEntry : entrySet) {
            System.out.println("Key :" + billingAndCancellationEntry.getKey());

        }


    }
}