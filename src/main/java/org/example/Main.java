package org.example;

public class Main {
    public static void main(String[] args) {
        Flight deltaFlight = new Flight("AI101", "New York" , 200, 150);
        Passenger firstPassenger = new Passenger("P123", "SarahConnor", "9876543210", null);

        firstPassenger.bookFlight("AI101");
        firstPassenger.bookFlight("AI101");

    }
}