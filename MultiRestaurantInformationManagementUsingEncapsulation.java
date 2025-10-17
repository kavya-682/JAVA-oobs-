/*
Problem
Design a Restaurant class in Java with private attributes id, name, email, phone, and address. Implement encapsulation by providing appropriate getter and setter methods for each attribute. Write a program that allows the user to create multiple objects of the Restaurant class. The program should take input from the user to set the values for each restaurant using the setters and then display the values using the getters.

Input Format
The first line contains an integer n representing the number of restaurants.

For the next n sets of lines, each set includes:

An integer representing the id.
A string representing the name.
A string representing the email.
A long integer representing the phone.
A string representing the address.
Output Format
The output should display the restaurant's information for each entry in the following order:

id
name
email
phone
address
Do's
Create a class: Define a class Restaurant with private attributes: id, name, email, phone, and address.
Implement encapsulation: Provide getter and setter methods for each attribute.
Input values: Use setter methods to input the values for the restaurant attributes.
Display information: Use getter methods to display each restaurant's information in the required format.
Sample Inputs & Outputs
Sample Input 1

2
1
Biryani Palace
biryani@example.com
9988776655
1234 Elm St, Bangalore
2
Spice Hub
spice@example.com
9876543210
7890 Oak St, Hyderabad
Sample Output 1

1
Biryani Palace
biryani@example.com
9988776655
1234 Elm St, Bangalore
2
Spice Hub
spice@example.com
9876543210
7890 Oak St, Hyderabad

*/

import java.util.*;

class Restaurant {
    // Private attributes
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;

    // Getter and Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for phone
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

public class MultiRestaurantInformationManagementUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // number of restaurants
        Restaurant[] restaurants = new Restaurant[n];

        for (int i = 0; i < n; i++) {
            restaurants[i] = new Restaurant();

            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String email = sc.nextLine();
            long phone = Long.parseLong(sc.nextLine());
            String address = sc.nextLine();

            // Set values using setters
            restaurants[i].setId(id);
            restaurants[i].setName(name);
            restaurants[i].setEmail(email);
            restaurants[i].setPhone(phone);
            restaurants[i].setAddress(address);
        }

        // Display restaurant details using getters
        for (Restaurant r : restaurants) {
            System.out.println(r.getId());
            System.out.println(r.getName());
            System.out.println(r.getEmail());
            System.out.println(r.getPhone());
            System.out.println(r.getAddress());
        }

        sc.close();
    }
}
