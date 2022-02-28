package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Ticket oneTicketTuDublin = new Ticket(2, 120, "msk", "nov", 240);
    Ticket twoTicketTuDublin = new Ticket(1, 110, "msk", "nov", 240);
    Repository repo = new Repository();

    @Test
    public void shouldAddAndFindAllToRepo() {
        repo.save(oneTicketTuDublin);
        repo.save(twoTicketTuDublin);
        Ticket[] expected = {oneTicketTuDublin, twoTicketTuDublin};
        Ticket[] actual = repo.findALL();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        repo.save(oneTicketTuDublin);
        repo.save(twoTicketTuDublin);
        repo.removeById(1);
        Ticket[] expected = {oneTicketTuDublin};
        Ticket[] actual = repo.findALL();
        assertArrayEquals(expected, actual);
    }
}