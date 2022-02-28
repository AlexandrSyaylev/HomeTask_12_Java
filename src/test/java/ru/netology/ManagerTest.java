package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Ticket oneTicketTuDublin = new Ticket(2, 120, "MOW", "NOV", 240);
    Ticket twoTicketTuDublin = new Ticket(1, 110, "KZN", "NOV", 240);
    Ticket freeTicket = new Ticket(3, 100, "VKO", "NOV", 240);
    Ticket freeForAll = new Ticket(4, 110, "VKO", "NOV", 240);
    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    @Test
    public void shouldAddToRepoByManager() {
        manager.add(oneTicketTuDublin);
        manager.add(twoTicketTuDublin);
        Ticket[] expected = {oneTicketTuDublin, twoTicketTuDublin};
        Ticket[] actual = repo.findALL();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAirport() {
        manager.add(oneTicketTuDublin);
        manager.add(twoTicketTuDublin);
        manager.add(freeTicket);
        Ticket[] expected = {freeTicket};
        Ticket[] actual = manager.searchBy("NOV", "VKO");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortByCost() {
        manager.add(oneTicketTuDublin);
        manager.add(twoTicketTuDublin);
        manager.add(freeForAll); //id 4 costs 110
        manager.add(freeTicket); //id 3 costs 100
        Ticket[] tmp = manager.searchBy("NOV", "VKO");
        Ticket[] expected = {freeTicket, freeForAll};
        Ticket[] actual = manager.sortByCosts(tmp);
        assertArrayEquals(expected, actual);
    }

}