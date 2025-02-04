package com.bhagya.exception.practice.service;

import com.bhagya.exception.practice.model.Passenger;
import com.bhagya.exception.practice.model.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TicketService {
    static HashMap<Integer, Ticket> ticketHashMap = new HashMap<Integer, Ticket>();
    private  static final Scanner scanner = new Scanner(System.in);
    int TicketIndex = 0;

    public void ticketinfo(Ticket ticket){
        System.out.println(ticket);
    }

    public Ticket ticketBooking(){

        Ticket ticket = new Ticket();
        System.out.println("Enter Your Seat Preference");
        String Preference = scanner.nextLine();
        System.out.println("Enter Your Destionation");
        String Destination = scanner.nextLine();
        System.out.println("Do you Wnat Add meal");
        String meal = scanner.nextLine();
        System.out.println("Your Total Amount");
        System.out.println("Your Ticket Amount Is : 5000Rs." + "Meal Charge = 1000rs"  + "CGST = 400rs"  + "Total amount is:6400rs");

        ticket.setSeatPreference(Preference);
        ticket.setDestination(Destination);
        ticket.setAddMeal(meal);
        return ticket;

    }


}
