/*
Problem
Design a Restaurant class in Java with private attributes id, name, email, phone, and address. Implement a constructor to initialize these attributes and provide getter methods to retrieve their values. Write a program that takes user input as a comma-separated string, initializes a Restaurant object using the constructor, and then displays the restaurant's details using the getter methods.

Input Format
The input consists of a single line:

A comma-separated string with the following values in this order:

An integer representing the id.
A string representing the name.
A string representing the email.
A long integer representing the phone.
A string representing the address.
Output Format
The output should display the restaurant's information in the following order:

id
name
email
phone
address
Do's
Create the class: Define a class named Restaurant.
Declare private attributes: Inside the class, declare private attributes: id, name, email, phone, and address.
Create a constructor: Implement a constructor that initializes the private attributes with the values provided by the user.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Take user input: Use a comma-separated string as input, split it, and initialize the attributes using the constructor.
Display output: Use the getter methods to display the restaurant information in the specified format.
Sample Inputs & Outputs
Sample Input 1

1,Donne Biryani,donnebiryani@gmail.com,6677889955,Btm layout Bengaluru
Sample Output 1

1
Donne Biryani
donnebiryani@gmail.com
6677889955
Btm layout Bengaluru
*/
import java.util.Scanner;

class Restaurant {
    // Private attributes
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;

    // Constructor to initialize all attributes
    public Restaurant(int id, String name, String email, long phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

public class RestaurantInformationManagementSystemUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read comma-separated input
        String input = sc.nextLine();
        String[] parts = input.split(",");

        // Parse input values
        int id = Integer.parseInt(parts[0].trim());
        String name = parts[1].trim();
        String email = parts[2].trim();
        long phone = Long.parseLong(parts[3].trim());
        String address = parts[4].trim();

        // Create Restaurant object
        Restaurant restaurant = new Restaurant(id, name, email, phone, address);

        // Display restaurant details using getter methods
        System.out.println(restaurant.getId());
        System.out.println(restaurant.getName());
        System.out.println(restaurant.getEmail());
        System.out.println(restaurant.getPhone());
        System.out.println(restaurant.getAddress());
    }
}
