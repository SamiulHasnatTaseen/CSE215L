/*
Name: Samiul Hasnat Taseen
ID: 2233054642
Course: CSE215.02
*/

//The program is for a self driving car system to decide its route based on traffic jam.

import java.util.Scanner;

// Custom exception subclass
class TrafficJamException extends Exception {
    private String location;

    // Default constructor
    public TrafficJamException() {

    }

    // Parameterized constructor
    public TrafficJamException(String message, String location) {
        super(message);
        this.location = location;
    }

    // Getter method for location
    public String getLocation() {
        return location;
    }

    // Override toString method
    @Override
    public String toString() {
        return "TrafficJamException == >" +
                "message: '" + getMessage() + '\'' +
                " at location: '" + location + '\'';
        // Here \ is used so that the compiler would print ' after the \
    }
}

// Hypothetical Navigation System class
class NavigationSystem {
    // Method to calculate a new route based on current location
    public static String calculateNewRoute(String currentLocation, String destination) {
    	//parseInt() method is a static method of the Integer class in Java. It takes a string as an
    	//argument and returns an integer
        int currentX = Integer.parseInt(currentLocation.split(",")[0]);
        int currentY = Integer.parseInt(currentLocation.split(",")[1]);
        // Logic to move one block up and one block right
        int newX = currentX + 1;
        int newY = currentY + 1;
        return newX + "," + newY;
    }
}

// Driver Class or the class that has the main method
public class Assignment1_2233054642 {
    private static void navigateSelfDrivingCar(String destination) throws TrafficJamException {
        if (Math.random() < 0.95) {
        	//Due to this logic 95% of the time there will be traffic jam and the error will be thrown
            throw new TrafficJamException("Traffic jam encountered", destination);
        } else {
            // Proceed with the journey
            System.out.println("Self-driving car arrived at destination: " + destination);
        }
    }

    // Method to handle reroutings or taking appropriate action for traffic jam
    private static void handleTrafficJam(String currentLocation, String destination) {
        System.out.println("Rerouting car to avoid traffic jam.");

        String newRoute = NavigationSystem.calculateNewRoute(currentLocation, destination);

        System.out.println("New route: Move to " + newRoute);

        System.out.println("New estimated time of arrival at " + destination + ": 15 minutes");
        // This will always print the hardcoded value of 15 minutes
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The program is for a self driving car system to decide its route based on traffic jam.");
        System.out.println("Due to the logic 95% of the time there will be traffic jam and the exception shall be thrown automatically.");
        // Take user input for current location
        System.out.print("Enter current location (Format: x,y): ");
        String currentLocation = scanner.nextLine();
        //currentLocation block is outside try so that the handleTrafficJam method inside catch can
        //access it.
        try {
            // Take user input for destination
            System.out.print("Enter destination (Format: x,y): ");
            String destination = scanner.nextLine();
            
            navigateSelfDrivingCar(destination);
        } catch (TrafficJamException e) {
            // Handling custom exception
            System.out.println("Traffic Jam Exception: " + e);
            System.out.println("Destination: " + e.getLocation());
            System.out.println("Alert: " + e.getMessage());

            handleTrafficJam(currentLocation, e.getLocation()); 
        } finally {
            // Close scanner
            scanner.close();
        }
    }
}
