package org.example;

public class Passenger {
    private String passengerId;
    private String name;
    private String contactNumber;
    private String flightBooked;

    //constructor
    public Passenger(String passengerId, String name, String contactNumber, String flightBooked) {
        this.passengerId = passengerId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.flightBooked = null;
    }

    //getters
    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return this.name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getFlightBooked() {
        return flightBooked;
    }

    //setters
    public void setContactNumber(String contactNumber) {
        if (contactNumber != null && contactNumber.length() != 10 && contactNumber.matches("\\d+")) {
            this.contactNumber = contactNumber;
        }
        else {
            System.out.println("Invalid contact number. It must be 10 digits.");
        }
    }

    public void bookFlight(String flightNumber) {
        if (this.flightBooked == null) {
            this.flightBooked = flightNumber;
            System.out.println("Passenger booked on flight " + flightNumber);
        }
        else {
            System.out.println("Booking failed. Passenger is already booked on flight " + flightNumber);
        }
    }

    public void cancelFlight() {
        if (this.flightBooked != null) {
            this.flightBooked = null;
            System.out.println("Flight booking cancelled.");
        }
        else {
            System.out.println("No booking to cancel.");
        }
    }
}
