package main;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine();
        Passenger passenger = new Passenger("Jan","kowalski");
        ticketMachine.BuyTicket(passenger, Duration.ofMinutes(30));
        System.out.println(passenger.getTicket().getEndTime());
    }
}