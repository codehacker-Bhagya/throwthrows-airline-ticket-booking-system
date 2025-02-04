package com.bhagya.exception.practice.service;

import com.bhagya.exception.practice.exception.InvalidMoNoException;
import com.bhagya.exception.practice.model.Passenger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PassengerService {
    static HashMap<Integer, Passenger> passengerHashMap = new HashMap<Integer, Passenger>();
    private static final Scanner scanner = new Scanner(System.in);
    int passengerIndex = 0;


    public void passengerData(Passenger passenger) {
        System.out.println(passenger);
    }

    public Passenger acceptPassenger() throws NumberFormatException {

        Passenger passenger = new Passenger();
        System.out.println("Enter Your full Name");
        String Name = scanner.nextLine();

        System.out.println("Enter Your Contact No");
        long MoNo = 0;
        try {
            MoNo = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("contact No must be in ten digit. Pls Enter Valid contact no");
        }
        if (MoNo != 10) {
            // System.out.println("Enter valid input");
        } else {
            throw new InvalidMoNoException("Ennter correct contact no");
        }

        System.out.println("Enter Your Uid No");
        long uid = scanner.nextLong();

        return passenger;
    }
    public void displayPassenger(){
        Set<Map.Entry<Integer , Passenger>> entrySet = passengerHashMap.entrySet();
        for(Map.Entry<Integer , Passenger> passengerEntry: entrySet){
            System.out.println("key: " + passengerEntry.getKey() + "value: " + passengerEntry);
        }
    }




}


