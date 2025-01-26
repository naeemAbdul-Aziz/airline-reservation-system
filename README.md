# airline-reservation-system

This repository contains a simple implementation of an Airline Reservation System using Java. The project demonstrates the principles of encapsulation to securely manage flight details, passenger information, and reservation operations.

## Features

- **Flight Management**: Create and manage flight details such as flight number, destination, capacity, and booked seats.
- **Passenger Management**: Handle passenger details such as unique ID, name, contact number, and flight booking.
- **Reservation Operations**: Book and cancel flight seats while maintaining proper state management.

## Classes

### 1. `Flight`
#### Fields:
- `flightNumber` (String): A unique identifier for the flight.
- `destination` (String): The flight's destination.
- `capacity` (int): The total number of seats on the flight.
- `bookedSeats` (int): The number of seats currently booked.

#### Constructor:
- Initializes `flightNumber`, `destination`, `capacity`, and `bookedSeats`.

#### Methods:
- **Getters and Setters**:
  - `getFlightNumber()`, `getDestination()`, `getCapacity()`, `getBookedSeats()`.
  - `setCapacity(int capacity)`: Ensures that `capacity` is greater than or equal to `bookedSeats`. Prints an error message if validation fails.
- **Reservation Operations**:
  - `bookSeat()`: Books a seat if available and prints the remaining seats or an error message.
  - `cancelSeat()`: Cancels a booked seat if any are booked and prints the available seats or an error message.

### 2. `Passenger`
#### Fields:
- `passengerId` (String): A unique identifier for the passenger.
- `name` (String): The passenger's name.
- `contactNumber` (String): The passenger's contact number.
- `flightBooked` (String): The flight number of the flight the passenger is booked on (initially `null`).

#### Constructor:
- Initializes `passengerId`, `name`, and `contactNumber`.

#### Methods:
- **Getters and Setters**:
  - `getPassengerId()`, `getName()`, `getContactNumber()`, `getFlightBooked()`.
  - `setContactNumber(String contactNumber)`: Ensures that `contactNumber` is exactly 10 digits long. Prints an error message if validation fails.
- **Flight Booking Operations**:
  - `bookFlight(String flightNumber)`: Books a flight for the passenger if not already booked and prints a success or error message.
  - `cancelFlight()`: Cancels the passenger's flight booking if any exists and prints a success or error message.

## Usage Instructions

1. **Create a `Flight` Object**:
   ```java
   Flight flight = new Flight("AI101", "New York", 200, 150);
   ```

2. **Create a `Passenger` Object**:
   ```java
   Passenger passenger = new Passenger("P123", "Sarah Connor", "9876543210");
   ```

3. **Perform Operations**:

   - **Book a Seat on the Flight**:
     ```java
     passenger.bookFlight("AI101");
     flight.bookSeat();
     ```

   - **Attempt to Book the Same Flight Again**:
     ```java
     passenger.bookFlight("AI101"); // Will print an error message
     ```

   - **Cancel the Passenger's Flight Booking**:
     ```java
     passenger.cancelFlight();
     flight.cancelSeat();
     ```

   - **Attempt to Cancel a Non-Existent Booking**:
     ```java
     passenger.cancelFlight(); // Will print an error message
     ```

   - **Set an Invalid Capacity for the Flight**:
     ```java
     flight.setCapacity(100); // Will print an error message
     ```

   - **Set an Invalid Contact Number for the Passenger**:
     ```java
     passenger.setContactNumber("12345"); // Will print an error message
     ```

## Example Output

```
Passenger booked on flight AI101.
Seat booked successfully. Remaining seats: 49
Booking failed. Passenger is already booked on flight AI101.
Flight booking cancelled.
Seat cancellation successful. Available seats: 50
No booking found to cancel.
Invalid capacity. It must be greater than or equal to booked seats.
Invalid contact number. It must be 10 digits.
```

## Requirements

- Java 8 or higher

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/airline-reservation-system.git
   ```

2. Compile and run the `Main` class:
   ```bash
   javac Main.java
   java Main
   ```

## License

This project is licensed under the MIT License. Feel free to use and modify it as needed.

