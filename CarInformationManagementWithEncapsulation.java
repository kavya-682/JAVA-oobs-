/*
Problem
Define a class Car with private attributes make, model, year, and price. Implement appropriate getter and setter methods to handle these attributes. Create a Car object, set its attributes using user input, and then display the car's details using the getter methods.

Input Format
The input consists of four lines:
A string representing the make.
A string representing the model.
An integer representing the year.
A float representing the price.
Output Format
The output should display the car's information in the following order:
make
model
year
price
Do's
Create the class: Define a class named Car.
Declare private attributes: Inside the class, declare private attributes: make, model, year, and price.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for make, model, year, and price from user input.
Display output using getter methods: Use the getter methods to display the car's information in the specified order.
Sample Inputs & Outputs
Sample Input 1

Toyota
Camry
2020
25000.50
Sample Output 1

Toyota
Camry
2020
25000.5

*/
import java.util.Scanner;

class Car {
    // Private attributes
    private String make;
    private String model;
    private int year;
    private float price;

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }
}

public class CarInformationManagementWithEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Car object
        Car car = new Car();

        // Take user input
        String make = sc.nextLine();
        String model = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());
        float price = Float.parseFloat(sc.nextLine());

        // Set values using setter methods
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        car.setPrice(price);

        // Display car details using getter methods
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());

        sc.close();
    }
}
