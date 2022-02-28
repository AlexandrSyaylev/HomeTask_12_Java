package ru.netology;

public class Ticket implements Comparable<Ticket> {
    /*public class Ticket {*/
    private int id;
    private int costs;
    private String outBoarding;
    private String destinationAirport;
    private int flyingTimeInMin;

    public Ticket() {

    }

    public Ticket(int id, int costs, String outBoarding, String destinationAirport, int flyingTimeInMin) {
        this.id = id;
        this.costs = costs;
        this.outBoarding = outBoarding;
        this.destinationAirport = destinationAirport;
        this.flyingTimeInMin = flyingTimeInMin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public String getOutBoarding() {
        return outBoarding;
    }

    public void setOutBoarding(String outBoarding) {
        this.outBoarding = outBoarding;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public int getFlyingTimeInMin() {
        return flyingTimeInMin;
    }

    public void setFlyingTimeInMin(int flyingTimeInMin) {
        this.flyingTimeInMin = flyingTimeInMin;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.getCosts() - o.getCosts();
    }

    @Override
    public String toString() {
        return "Ticket " + "Id = " + this.id + " costs = " + this.costs +
                " From: " + this.outBoarding + " to: " + this.destinationAirport +
                " Flying Time: " + this.flyingTimeInMin;
    }
}
