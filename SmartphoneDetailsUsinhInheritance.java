/*
Problem
Create a class Device with private attributes brand and model. It should have methods to set and get these attributes. Additionally, it should have a method getDetails() which returns a string with device details.

Derive a class MobileDevice from Device, adding an attribute batteryLife. It should override the getDetails() method to include the battery life in the device details.

Derive another class named Smartphone from MobileDevice, adding an attribute operatingSystem. It should override the getDetails() method to include the operating system in the mobile device details.

Write a program that asks the user to create a Smartphone object, collects the details from the user, and displays the smartphone details.

Input Format
The first line contains the smartphone details in the format: brand,model,batteryLife,operatingSystem.

Output Format
A single line displaying the smartphone details in the format:

Smartphone Details: Brand: <Brand>, Model: <Model>, Battery Life: <BatteryLife>, Operating System: <OperatingSystem>.

Do's
Create a base class named Device.
Use private variables in the Device class named brand and model.
Create a subclass named MobileDevice using inheritance.
Use a private variable in the MobileDevice class named batteryLife.
Create a subclass named Smartphone using inheritance.
Use a private variable in the Smartphone class named operatingSystem.
Override the getDetails() method in MobileDevice and Smartphone.
Create appropriate public getters and setters for variables in Device, MobileDevice, and Smartphone.
Follow PascalCase for class names and camelCase for variable and method names.
Sample Inputs & Outputs
Sample Input 1

Apple,iPhone 13,20 hours,iOS
Sample Output 1

Smartphone Details: Brand: Apple, Model: iPhone 13, Battery Life: 20 hours, Operating System: iOS
Sample Input 2

Samsung,Galaxy S21,18 hours,Android
Sample Output 2

Smartphone Details: Brand: Samsung, Model: Galaxy S21, Battery Life: 18 hours, Operating System: Android
*/

import java.util.Scanner;

// Base class
class Device {
    private String brand;
    private String model;

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method to return device details
    public String getDetails() {
        return "Brand: " + brand + ", Model: " + model;
    }
}

// Derived class
class MobileDevice extends Device {
    private String batteryLife;

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Battery Life: " + batteryLife;
    }
}

// Derived class
class Smartphone extends MobileDevice {
    private String operatingSystem;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getDetails() {
        return "Smartphone Details: " + super.getDetails() + ", Operating System: " + operatingSystem;
    }
}

// Main class
public class SmartphoneDetailsUsinhInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        String[] parts = input.split(",");

        // Create Smartphone object and set values
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand(parts[0]);
        smartphone.setModel(parts[1]);
        smartphone.setBatteryLife(parts[2]);
        smartphone.setOperatingSystem(parts[3]);

        // Display details
        System.out.println(smartphone.getDetails());

        sc.close();
    }
}
