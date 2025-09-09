/*
Problem
Create a class Device with private attributes brand and model. It should have methods to set and get these attributes. Additionally, it should have a method getDetails() which returns a string with device details.

Derive a class Laptop from Device, adding an attribute ram. It should override the getDetails() method to include the RAM size in the device details.

Derive another class named Smartphone from Device, adding an attribute battery. It should override the getDetails() method to include the battery capacity in the device details.

Write a program that asks the user which type of device needs to be created. According to the user's choice, collect the details from the user and display the details of the respective device.

Input Format
The first line contains the type of device ("Laptop" or "Smartphone").

The second line contains a comma-separated list of the attributes for the device:

For a Laptop: brand, model, ram
For a Smartphone: brand, model, battery
Output Format
A single line displaying the details of the device in the format:

Device Details: Brand: <Brand>, Model: <Model>, RAM: <RAM> for Laptop
Device Details: Brand: <Brand>, Model: <Model>, Battery: <Battery> for Smartphone
Do's
Create a base class named Device.
Use private variables in the Device class named brand and model.
Create a subclass named Laptop using inheritance.
Use a private variable in the Laptop class named ram.
Create a subclass named Smartphone using inheritance.
Use a private variable in the Smartphone class named battery.
Override the getDetails() method in Laptop and Smartphone.
Create appropriate public getters and setters for variables in Device, Laptop, and Smartphone.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Laptop
Dell,XPS 13,16GB
Sample Output 1

Device Details: Brand: Dell, Model: XPS 13, RAM: 16GB
Sample Input 2

Smartphone
Apple,iPhone 12,2815mAh
Sample Output 2

Device Details: Brand: Apple, Model: iPhone 12, Battery: 2815mAh
Constraints
1. The `brand` and `model` are strings with a maximum length of 50 characters each.

2. The `ram` for Laptop is a string with a maximum length of 10 characters.

3. The `battery` for Smartphone is a string with a maximum length of 20 characters.

4. Input values must be provided in the correct format, otherwise, the program should handle errors gracefully.

5. There must be no leading or trailing spaces in the comma-separated input values.
*/

import java.util.Scanner;

class Device {
    private String brand;
    private String model;

    // Constructor
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method to return details
    public String getDetails() {
        return "Device Details: Brand: " + brand + ", Model: " + model;
    }
}

// Laptop subclass
class Laptop extends Device {
    private String ram;

    public Laptop(String brand, String model, String ram) {
        super(brand, model);
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String getDetails() {
        return "Device Details: Brand: " + getBrand() + ", Model: " + getModel() + ", RAM: " + ram;
    }
}

// Smartphone subclass
class Smartphone extends Device {
    private String battery;

    public Smartphone(String brand, String model, String battery) {
        super(brand, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String getDetails() {
        return "Device Details: Brand: " + getBrand() + ", Model: " + getModel() + ", Battery: " + battery;
    }
}

// Main class
public class DeviceInformationUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String deviceType = sc.nextLine().trim();
            String[] attributes = sc.nextLine().trim().split(",");

            if (deviceType.equals("Laptop") && attributes.length == 3) {
                String brand = attributes[0];
                String model = attributes[1];
                String ram = attributes[2];

                Laptop laptop = new Laptop(brand, model, ram);
                System.out.println(laptop.getDetails());

            } else if (deviceType.equals("Smartphone") && attributes.length == 3) {
                String brand = attributes[0];
                String model = attributes[1];
                String battery = attributes[2];

                Smartphone smartphone = new Smartphone(brand, model, battery);
                System.out.println(smartphone.getDetails());

            } else {
                System.out.println("Invalid input format!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
