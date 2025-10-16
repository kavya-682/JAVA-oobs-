/*
Problem
Design a Menu class in Java with private attributes id, name, price, and description. Create a constructor to initialize these attributes and implement encapsulation by providing appropriate getter and setter methods for each attribute. Write a program that takes input from the user in a comma-separated string format, creates an object of the Menu class, and then displays the values using the getter methods.

Input Format
The input consists of a single line:

A comma-separated string with the following values in this order:

An integer representing the id.
A string representing the name.
A double representing the price.
A string representing the description.
Output Format
The output should display the menu item's information in the following order:

id
name
price
description
Do's
Create the class: Define a class named Menu.
Declare private attributes: Inside the class, declare private attributes: id, name, price, and description.
Create a constructor: Implement a constructor that initializes the private attributes with the values provided by the user.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Take user input: Use a comma-separated string as input, split it, and initialize the attributes using the constructor.
Display output: Use the getter methods to display the menu item information in the specified format.
Sample Inputs & Outputs
Sample Input 1

1,Paneer Butter Masala,250,A butter rich paneer curry
Sample Output 1

1
Paneer Butter Masala
250.0
A butter rich paneer curry
*/

import java.util.Scanner;

class MenuItemManagementSystemUsingEncapsulation {
    // Private attributes
    private int id;
    private String name;
    private double price;
    private String description;

    // Constructor to initialize attributes
    public Menu(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input as comma-separated string
        String input = sc.nextLine();
        String[] parts = input.split(",");

        // Parse values
        int id = Integer.parseInt(parts[0].trim());
        String name = parts[1].trim();
        double price = Double.parseDouble(parts[2].trim());
        String description = parts[3].trim();

        // Create Menu object
        Menu menuItem = new Menu(id, name, price, description);

        // Display values using getter methods
        System.out.println(menuItem.getId());
        System.out.println(menuItem.getName());
        System.out.println(menuItem.getPrice());
        System.out.println(menuItem.getDescription());

        sc.close();
    }
}
