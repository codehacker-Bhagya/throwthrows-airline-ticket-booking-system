package com.bhagya.exception.practice.service;

import com.bhagya.exception.practice.model.Flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FlightService {
    static HashMap<Integer , Flight> flightHashMap = new HashMap<Integer, Flight>();
    private static final Scanner scanner = new Scanner(System.in);
    int flightIndex = 0;

    public static void flightData(Flight flight){
        System.out.println(flight);
    }

    public Flight flightInformation() throws NumberFormatException{

        Flight flight = new Flight();

        System.out.println("Enter Flight Name ");
        try {
            String flightName = scanner.nextLine();
        } catch (NumberFormatException e){
            throw new NumberFormatException("Digits Not allowed enter correct flight Name");
        }

        System.out.println("Enter Flight No");
        int flightNo = Integer.parseInt(scanner.nextLine());

        System.out.println("Your Flight Time is 9 am. on 08/02/2025");
        System.out.println("Flight Status : Your reporting time is 7 am. ");

        return flight;
    }
    public void displayFlight(){
        Set<Map.Entry <Integer , Flight>> entrySet = flightHashMap.entrySet();
        for ( Map.Entry<Integer , Flight> flightEntry: entrySet){
            System.out.println("key: " + flightEntry.getKey() + "value " + flightEntry.getValue());

        }
    }



}
