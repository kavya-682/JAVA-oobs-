/*
Problem
Create a class Plant with private attributes species and height. It should have methods to set and get these attributes. Additionally, it should have a method getInfo() which returns a string with plant details.

Derive a class FloweringPlant from Plant, adding an attribute flowerColor. It should override the getInfo() method to include the flower color in the plant details.

Derive another class named Rose from FloweringPlant, adding an attribute thorns. It should override the getInfo() method to include whether the rose has thorns.

Write a program that asks the user to create a Rose object, collects the details from the user, and displays the rose details.

Input Format
The input consists of a single line containing comma-separated values for the rose attributes: species,height,flowerColor,thorns

species: The species of the rose (e.g., "Rosa").
height: The height of the rose (e.g., "1.2m").
flowerColor: The color of the flower (e.g., "Red").
thorns: A boolean indicating if the rose has thorns (e.g., true or false).
Output Format
A single line displaying the rose details in the format:

Rose Details: Species: <Species>, Height: <Height>, Flower Color: <FlowerColor>, Thorns: <Thorns>

Do's
Create a base class named Plant.
Use private variables in the Plant class named species and height.
Create a subclass named FloweringPlant using inheritance.
Use a private variable in the FloweringPlant class named flowerColor.
Create a subclass named Rose using inheritance.
Use a private variable in the Rose class named thorns.
Override the getInfo() method in FloweringPlant and Rose.
Create appropriate public getters and setters for variables in Plant, FloweringPlant, and Rose class.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Rosa,1.2m,Red,true
Sample Output 1

Rose Details: Species: Rosa, Height: 1.2m, Flower Color: Red, Thorns: true
Sample Input 2

Rosa,0.8m,Yellow,false
Sample Output 2

Rose Details: Species: Rosa, Height: 0.8m, Flower Color: Yellow, Thorns: false
*/

import java.util.Scanner;

// Base class
class Plant {
    private String species;
    private String height;

    // Getters and Setters
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }

    // Method to get info
    public String getInfo() {
        return "Species: " + species + ", Height: " + height;
    }
}

// Derived class
class FloweringPlant extends Plant {
    private String flowerColor;

    // Getter and Setter
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    // Override getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Flower Color: " + flowerColor;
    }
}

// Derived class
class Rose extends FloweringPlant {
    private boolean thorns;

    // Getter and Setter
    public boolean getThorns() {
        return thorns;
    }
    public void setThorns(boolean thorns) {
        this.thorns = thorns;
    }

    // Override getInfo
    @Override
    public String getInfo() {
        return "Rose Details: " + super.getInfo() + ", Thorns: " + thorns;
    }
}

// Main class
public class RoseDetailsUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        // Split input
        String[] parts = input.split(",");

        // Create Rose object
        Rose rose = new Rose();
        rose.setSpecies(parts[0].trim());
        rose.setHeight(parts[1].trim());
        rose.setFlowerColor(parts[2].trim());
        rose.setThorns(Boolean.parseBoolean(parts[3].trim()));

        // Print rose details
        System.out.println(rose.getInfo());
    }
}
