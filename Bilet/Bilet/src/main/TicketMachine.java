package main;

import java.time.Duration;
import java.time.ZonedDateTime;

public class TicketMachine {
    public void BuyTicket(Passenger person, Duration time){
        Ticket ticket = new Ticket(true, ZonedDateTime.now(),ZonedDateTime.now(),ZonedDateTime.now().plus(time));
        person.setTicket(ticket);
    }

}
