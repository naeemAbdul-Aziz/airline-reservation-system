package org.example;

public class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String destination, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    //getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    //setters
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCapacity(int capacity) {
        if (capacity >= bookedSeats) {
            this.capacity = capacity;
        } else {
            System.out.println("Invalid capacity. It must be greater than or equal to booked seats");
        }
    }


    public void setBookedSeats() {
        if (bookedSeats < capacity) {
            this.bookedSeats += 1;
            System.out.println("No seats available.");
        }
    }

    public void cancelSeat() {
        if(bookedSeats >= 0) {
            System.out.println("No bookings to cancel.");
        }
    }
}





