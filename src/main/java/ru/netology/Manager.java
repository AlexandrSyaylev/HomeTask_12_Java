package ru.netology;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Manager {
    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void add(Ticket product) {
        repository.save(product);
    }

    public Ticket[] searchBy(String to, String from) {
        Ticket[] result = new Ticket[0];
        for (Ticket product : repository.findALL()) {
            if (matches(product, to, from)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Ticket product, String searchTo, String searchForm) {
        if (product.getDestinationAirport().contains(searchTo)) {
            return product.getOutBoarding().contains(searchForm);
        }
        return false;
    }

    public Ticket[] sortByCosts(Ticket[] tickets) {
        //Arrays.sort(tickets, Collections.reverseOrder()); //Use for drop down and control
        Arrays.sort(tickets);
        for (Ticket i : tickets) {
            System.out.println(" After Sort list");
            System.out.println(i);
        }
        return tickets;
    }
}
