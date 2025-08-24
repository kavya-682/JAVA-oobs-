/*
 Problem
Define a class Car with private attributes make, model, year, and price. Implement appropriate getter and setter methods to handle these attributes.
Create a Car object, set its attributes using user input, and then display the car's details using the getter methods.

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
Constraints
The make and model must be non-empty strings.
The year must be a positive integer between 1886 and the current year.
 */
package String;

import java.util.Scanner;

public class CarInformationManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car car = new Car();
		
	   String make = scanner.nextLine();
	   String model = scanner.nextLine();
	   int year = scanner.nextInt();
	   float price = scanner.nextFloat();
	// call the setters for set the data 
	   car.setMake(make);
	   car.setModel(model);
	   car.setYear(year);
	   car.setPrice(price);
	   
	// get the data using getters
	  System.out.println(car.getMake());
	  System.out.println(car.getModel());
	  System.out.println(car.getYear());
	  System.out.println(car.getPrice());
	   
	   

	}

}
class Car{
	private String make;
	  private String model;
	  private int year;
	  private float  price;
	  // getter and setter for make
	  public String getMake() {
		  return make;
	  }
	  public void setMake(String make) {
		  this.make = make;
	  }
	  
	// getter and setter for model
	  public String getModel() {
		  return model;
	  }
	  public void setModel(String model) {
		  this.model = model;
	  }
	  
	// getter and setter for year
	  public int getYear() {
		  return year;
	  }
	  public void setYear(int year) {
		  this.year = year;
	  }
	  
	// getter and setter for price
	  public float getPrice() {
		  return price;
	  }
	  public void setPrice(float price) {
		  this.price = price;
	  }
	
}
