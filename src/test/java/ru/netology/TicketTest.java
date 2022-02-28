package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    public void shouldSetAndGetId() {
        Ticket oneTicketTuDublin = new Ticket();
        oneTicketTuDublin.setId(1);
        int expected = 1;
        int actual = oneTicketTuDublin.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAndGetCosts() {
        Ticket oneTicketTuDublin = new Ticket();
        oneTicketTuDublin.setCosts(100);
        int expected = 100;
        int actual = oneTicketTuDublin.getCosts();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAndGetOutboard() {
        Ticket oneTicketTuDublin = new Ticket();
        oneTicketTuDublin.setOutBoarding("msk");
        String expected = "msk";
        String actual = oneTicketTuDublin.getOutBoarding();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAndGetDestination() {
        Ticket oneTicketTuDublin = new Ticket();
        oneTicketTuDublin.setDestinationAirport("msk");
        String expected = "msk";
        String actual = oneTicketTuDublin.getDestinationAirport();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAndGetFlyingTime() {
        Ticket oneTicketTuDublin = new Ticket();
        oneTicketTuDublin.setFlyingTimeInMin(600);
        int expected = 600;
        int actual = oneTicketTuDublin.getFlyingTimeInMin();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSortByCosts() {
        List<Ticket> tickets = new ArrayList<>();
        Ticket oneTicketTuDublin = new Ticket(2, 120, "msk", "nov", 240);
        Ticket twoTicketTuDublin = new Ticket(1, 110, "msk", "nov", 240);
        Ticket freeTicket = new Ticket(3, 100, "msk", "nov", 240);
        tickets.add(oneTicketTuDublin);
        tickets.add(twoTicketTuDublin);
        tickets.add(freeTicket);
        Collections.sort(tickets);
        System.out.println(" After Sort list");
        for (Ticket i : tickets) {
            System.out.println(i);
        }

    }
}