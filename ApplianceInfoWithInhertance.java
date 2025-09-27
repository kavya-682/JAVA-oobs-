/*
Problem
Create a class Appliance with private attributes brand and power. The class should include methods to set and get these attributes. Additionally, it should have a method getInfo() that returns a string containing the appliance's details.

Derive a class WashingMachine from Appliance, adding an attribute capacity. The WashingMachine class should override the getInfo() method to include the capacity in the appliance details.

Write a program that prompts the user to enter the details of a WashingMachine object, and then displays the details of the washing machine using the getInfo() method.

Input Format
A single line containing the details of the washing machine as a comma-separated string in the following order: brand, power, capacity.

Output Format
A single line displaying the washing machine details in the format: Washing Machine Info: Brand: <brand>, Power: <power>, Capacity: <capacity>.

Do's
Create a base class named Appliance.
Use private variables brand and power in the Appliance class.
Create a subclass named WashingMachine using inheritance.
Use a private variable capacity in the WashingMachine class.
Override the getInfo() method in the WashingMachine class.
Create appropriate public getters and setters for the variables in both Appliance and WashingMachine classes.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Samsung,2000W,7kg
Sample Output 1

Washing Machine Info: Brand: Samsung, Power: 2000W, Capacity: 7kg
Sample Input 2

LG,1500W,8kg
Sample Output 2

Washing Machine Info: Brand: LG, Power: 1500W, Capacity: 8kg
*/
import java.util.Scanner;

// Base class Appliance
class Appliance {
    private String brand;
    private String power;

    // Getters and Setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }

    // Method to get appliance info
    public String getInfo() {
        return "Brand: " + brand + ", Power: " + power;
    }
}

// Subclass WashingMachine
class WashingMachine extends Appliance {
    private String capacity;

    // Getter and Setter
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    // Override getInfo
    @Override
    public String getInfo() {
        return "Washing Machine Info: Brand: " + getBrand() +
               ", Power: " + getPower() +
               ", Capacity: " + capacity;
    }
}

// Main class
public class ApplianceInfoWithInhertance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: brand,power,capacity
        String input = sc.nextLine();
        String[] details = input.split(",");

        // Create WashingMachine object
        WashingMachine wm = new WashingMachine();
        wm.setBrand(details[0].trim());
        wm.setPower(details[1].trim());
        wm.setCapacity(details[2].trim());

        // Display washing machine info
        System.out.println(wm.getInfo());

        sc.close();
    }
}
