/*
Problem
Create a class Instrument with private attributes type and origin. It should have methods to set and get these attributes. Additionally, it should have a method getDetails() which returns a string with instrument details.

Derive a class StringInstrument from Instrument, adding an attribute numberOfStrings. It should override the getDetails() method to include the number of strings in the instrument details.

Derive another class named Guitar from StringInstrument, adding an attribute electric. It should override the getDetails() method to include whether the guitar is electric or acoustic.

Write a program that asks the user to create a Guitar object, collects the details from the user, and displays the guitar details.

Input Format
The input consists of a single line containing comma-separated values for the guitar attributes: type,origin,numberOfStrings,electric

type: The type of instrument (e.g., "String").
origin: The origin of the instrument (e.g., "Spain").
numberOfStrings: The number of strings on the guitar (e.g., 6).
electric: A boolean indicating if the guitar is electric (e.g., true or false).
Output Format
A single line displaying the guitar details in the format:

Guitar Details: Type: <Type>, Origin: <Origin>, Number of Strings: <NumberOfStrings>, Electric: <Electric>

Do's
Create a base class named Instrument.
Use private variables in the Instrument class named type and origin.
Create a subclass named StringInstrument using inheritance.
Use a private variable in the StringInstrument class named numberOfStrings.
Create a subclass named Guitar using inheritance.
Use a private variable in the Guitar class named electric.
Override the getDetails() method in StringInstrument and Guitar.
Create appropriate public getters and setters for variables in Instrument, StringInstrument, and Guitar class.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

String,Spain,6,true
Sample Output 1

Guitar Details: Type: String, Origin: Spain, Number of Strings: 6, Electric: true
Sample Input 2

String,USA,12,false
Sample Output 2

Guitar Details: Type: String, Origin: USA, Number of Strings: 12, Electric: false

*/

import java.util.Scanner;

// Base class
class Instrument {
    private String type;
    private String origin;

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // Method to return instrument details
    public String getDetails() {
        return "Type: " + type + ", Origin: " + origin;
    }
}

// Derived class
class StringInstrument extends Instrument {
    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Number of Strings: " + numberOfStrings;
    }
}

// Derived class
class Guitar extends StringInstrument {
    private boolean electric;

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String getDetails() {
        return "Guitar Details: " + super.getDetails() + ", Electric: " + electric;
    }
}

// Main class
public class GuitarDetailsUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        String[] parts = input.split(",");

        // Create Guitar object and set values
        Guitar guitar = new Guitar();
        guitar.setType(parts[0]);
        guitar.setOrigin(parts[1]);
        guitar.setNumberOfStrings(Integer.parseInt(parts[2]));
        guitar.setElectric(Boolean.parseBoolean(parts[3]));

        // Display details
        System.out.println(guitar.getDetails());

        sc.close();
    }
}
