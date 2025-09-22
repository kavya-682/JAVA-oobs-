/*
Problem
Write a Java program to model a computer system using Composition and Aggregation.

Create a Computer class that contains the following:
A composition relationship with a Processor class.
An aggregation relationship with a Monitor class.
The Processor class is tightly bound to the Computer, while the Monitor can exist independently. The Computer class should contain methods to display the details of its processor and monitor.

Input Format
There is no user input required for this question. Use the following values for the respective classes:

Processor:
brand: Intel
cores: 4
clockSpeed: 2.5 GHz
Monitor:
brand: Dell
size: 24 inches
Output Format
The output should display the details of the computer's processor and monitor in the following format:

Processor Brand: Intel

Processor Cores: 4

Processor Clock Speed: 2.5 GHz

Monitor Brand: Dell

Monitor Size: 24 inches

Do's
Create a class named Processor with private attributes brand (String), cores (int), and clockSpeed (double). Include appropriate getters for these attributes.
Create a class named Monitor with private attributes brand (String) and size (int). Include appropriate getters for these attributes.
Create a class named Computer that has a composition relationship with the Processor class. The Processor object should be instantiated inside the Computer class.
Establish an aggregation relationship in the Computer class by passing a Monitor object via a method.
Inside the Computer class, define methods to print the Processor and Monitor details.
In the main method, instantiate a Computer and a Monitor. Display the processor and monitor details.
Use the following values: Processor attributes: brand: Intel, cores: 4, clockSpeed: 2.5 GHz Monitor attributes: brand: Dell, size: 24 inches
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Processor Brand: Intel
Processor Cores: 4
Processor Clock Speed: 2.5 GHz
Monitor Brand: Dell
Monitor Size: 24 inches
Constraints
The processor should be part of the Computer class (composition).

The monitor should be passed to the Computer class and displayed (aggregation).
*/

// Processor class - Composition
class Processor {
    private String brand;
    private int cores;
    private double clockSpeed;

    public Processor(String brand, int cores, double clockSpeed) {
        this.brand = brand;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getCores() {
        return cores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}

// Monitor class - Aggregation
class Monitor {
    private String brand;
    private int size;

    public Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}

// Computer class
class Computer {
    // Composition: Processor is tightly bound
    private Processor processor;

    public Computer() {
        // Initialize Processor inside Computer (composition)
        this.processor = new Processor("Intel", 4, 2.5);
    }

    // Method to display Processor details
    public void displayProcessor() {
        System.out.println("Processor Brand: " + processor.getBrand());
        System.out.println("Processor Cores: " + processor.getCores());
        System.out.println("Processor Clock Speed: " + processor.getClockSpeed() + " GHz");
    }

    // Method to display Monitor details (aggregation)
    public void displayMonitor(Monitor monitor) {
        System.out.println("Monitor Brand: " + monitor.getBrand());
        System.out.println("Monitor Size: " + monitor.getSize() + " inches");
    }
}

// Main class
public class AggregationCompositionUsingComputerMonitorProcessor {
    public static void main(String[] args) {
        // Create Computer object (Processor created inside)
        Computer computer = new Computer();

        // Display processor details
        computer.displayProcessor();

        // Create Monitor object (exists independently)
        Monitor monitor = new Monitor("Dell", 24);

        // Display monitor details via Computer
        computer.displayMonitor(monitor);
    }
}
