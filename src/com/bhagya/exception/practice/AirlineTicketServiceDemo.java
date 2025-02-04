package com.bhagya.exception.practice;

import com.bhagya.exception.practice.model.BillingAndCancellation;
import com.bhagya.exception.practice.model.Flight;
import com.bhagya.exception.practice.model.Passenger;
import com.bhagya.exception.practice.model.Ticket;
import com.bhagya.exception.practice.service.BillingAndCancellationService;
import com.bhagya.exception.practice.service.FlightService;
import com.bhagya.exception.practice.service.PassengerService;
import com.bhagya.exception.practice.service.TicketService;

import java.util.Scanner;

public class AirlineTicketServiceDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        do {

            System.out.println("Welcome to Airline booking System");
            System.out.println("Enter your option");
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. Billing And Ticket Cancellation Details");
            System.out.println("5. Diplay Passenger");
            System.out.println("0. Exit ");

            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    PassengerService passengerService = new PassengerService();
                passengerService.acceptPassenger();
                Passenger passenger = new Passenger();
                passengerService.displayPassenger();
                System.out.println("Passenger Created " + passenger);
                break;
            }
            switch (option){
                case 2:
                    FlightService flightService = new FlightService();
                    flightService.flightInformation();
                    Flight flight = new Flight();
                    flightService.displayFlight();
                    System.out.println("Your Flight Information" + flight);
                    break;
            }
            switch(option){
                case 3:
                    TicketService ticketService = new TicketService();
                    ticketService.ticketBooking();
                    Ticket ticket = new Ticket();
                   // ticketService.ticketinfo(Ticket ticket);
                    System.out.println("Ticket bookes " + ticket);
                    break;
            }
            switch(option ){
                case 4 :
                    BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();
                    billingAndCancellationService.BillingService();
                    BillingAndCancellation billingAndCancellation = new BillingAndCancellation();
                    billingAndCancellationService.displayBilling();
                    System.out.println("pls collect your recepiet" + billingAndCancellation);
            }



        } while (option != 0);
    }
}