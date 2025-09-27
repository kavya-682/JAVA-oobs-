/*
Problem
Create a class Animal with private attributes species and lifespan. The class should include methods to set and get these attributes. Additionally, it should have a method getDetails() that returns a string containing the animal's details.

Derive a class Bird from Animal, adding an attribute wingSpan. The Bird class should override the getDetails() method to include the wingspan in the animal details.

Write a program that prompts the user to enter the details of a Bird object, and then displays the details of the bird using the getDetails() method.

Input Format
A single line containing the details of the bird as a comma-separated string in the following order: species, lifespan, wingSpan.
Output Format
A single line displaying the bird details in the format:
Bird Details: Species: <species>, Lifespan: <lifespan>, Wingspan: <wingSpan>.

Do's
Create a base class named Animal.
Use private variables species and lifespan in the Animal class.
Create a subclass named Bird using inheritance.
Use a private variable wingSpan in the Bird class.
Override the getDetails() method in the Bird class.
Create appropriate public getters and setters for the variables in both Animal and Bird classes.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Parrot,50 years,25cm
Sample Output 1

Bird Details: Species: Parrot, Lifespan: 50 years, Wingspan: 25cm
Sample Input 2

Eagle,20 years,200cm
Sample Output 2

Bird Details: Species: Eagle, Lifespan: 20 years, Wingspan: 200cm
*/
import java.util.Scanner;

// Base class Animal
class Animal {
    private String species;
    private String lifespan;

    // Getters and Setters
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLifespan() {
        return lifespan;
    }
    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    // Method to get details
    public String getDetails() {
        return "Species: " + species + ", Lifespan: " + lifespan;
    }
}

// Subclass Bird
class Bird extends Animal {
    private String wingSpan;

    // Getter and Setter
    public String getWingSpan() {
        return wingSpan;
    }
    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    // Override getDetails
    @Override
    public String getDetails() {
        return "Bird Details: Species: " + getSpecies() +
               ", Lifespan: " + getLifespan() +
               ", Wingspan: " + wingSpan;
    }
}

// Main class
public class AnimalInfoWithInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: species,lifespan,wingSpan
        String input = sc.nextLine();
        String[] details = input.split(",");

        // Create Bird object
        Bird bird = new Bird();
        bird.setSpecies(details[0].trim());
        bird.setLifespan(details[1].trim());
        bird.setWingSpan(details[2].trim());

        // Display bird details
        System.out.println(bird.getDetails());

        sc.close();
    }
}
