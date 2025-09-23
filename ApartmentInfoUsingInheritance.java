/*
Problem
Create a class Building with private attributes address and floors. It should have methods to set and get these attributes. Additionally, it should have a method getDetails() which returns a string with building details.

Derive a class ResidentialBuilding from Building, adding an attribute numberOfApartments. It should override the getDetails() method to include the number of apartments in the building details.

Derive another class named Apartment from ResidentialBuilding, adding an attribute unitNumber. It should override the getDetails() method to include the unit number in the apartment details.

Write a program that asks the user to create an Apartment object, collects the details from the user, and displays the apartment details.

Input Format
The input consists of a single line containing comma-separated values for the apartment attributes: address,floors,numberOfApartments,unitNumber

address: The address of the building (e.g., "123 Main St").
floors: The number of floors in the building (e.g., 10).
numberOfApartments: The number of apartments in the building (e.g., 50).
unitNumber: The unit number of the apartment (e.g., "5B").
Output Format
A single line displaying the apartment details in the format:

Apartment Details: Address: <Address>, Floors: <Floors>, Number of Apartments: <NumberOfApartments>, Unit Number: <UnitNumber>

Do's
Create a base class named Building.
Use private variables in the Building class named address and floors.
Create a subclass named ResidentialBuilding using inheritance.
Use a private variable in the ResidentialBuilding class named numberOfApartments.
Create a subclass named Apartment using inheritance.
Use a private variable in the Apartment class named unitNumber.
Override the getDetails() method in ResidentialBuilding and Apartment.
Create appropriate public getters and setters for variables in Building, ResidentialBuilding, and Apartment class.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

123 Main St,10,50,5B
Sample Output 1

Apartment Details: Address: 123 Main St, Floors: 10, Number of Apartments: 50, Unit Number: 5B
Sample Input 2

456 Elm St,15,75,10A
Sample Output 2

Apartment Details: Address: 456 Elm St, Floors: 15, Number of Apartments: 75, Unit Number: 10A
*/

import java.util.Scanner;

// Base class
class Building {
    private String address;
    private int floors;

    // Getters and Setters
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }

    // Method to get details
    public String getDetails() {
        return "Address: " + address + ", Floors: " + floors;
    }
}

// Derived class
class ResidentialBuilding extends Building {
    private int numberOfApartments;

    // Getter and Setter
    public int getNumberOfApartments() {
        return numberOfApartments;
    }
    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    // Override getDetails
    @Override
    public String getDetails() {
        return super.getDetails() + ", Number of Apartments: " + numberOfApartments;
    }
}

// Derived class
class Apartment extends ResidentialBuilding {
    private String unitNumber;

    // Getter and Setter
    public String getUnitNumber() {
        return unitNumber;
    }
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    // Override getDetails
    @Override
    public String getDetails() {
        return "Apartment Details: " + super.getDetails() + ", Unit Number: " + unitNumber;
    }
}

// Main class
public class ApartmentInfoUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        // Split input
        String[] parts = input.split(",");

        // Create Apartment object
        Apartment apartment = new Apartment();
        apartment.setAddress(parts[0].trim());
        apartment.setFloors(Integer.parseInt(parts[1].trim()));
        apartment.setNumberOfApartments(Integer.parseInt(parts[2].trim()));
        apartment.setUnitNumber(parts[3].trim());

        // Print details
        System.out.println(apartment.getDetails());
    }
}
