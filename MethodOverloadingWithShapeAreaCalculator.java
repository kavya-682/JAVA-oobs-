/*
Problem
Write a Java program that defines a class named ShapeAreaCalculator with multiple overloaded calculateArea methods to compute the area of different shapes using various parameters. You need to create these methods and call them with the specified values.

Input Format
No input from the user is required.

Output Format
The results of the area calculations performed by the overloaded calculateArea methods.

Do's
Create a class: Define a class named ShapeAreaCalculator.
Create overloaded methods: Define four calculateArea methods with different parameters inside the ShapeAreaCalculator class.
Use method overloading: The methods should have the same name (calculateArea) but different parameter lists.
Call the methods: In the main method, create an instance of the ShapeAreaCalculator class and call each of the calculateArea methods with the following values:
Calculate the area of a square with side length 5.

Calculate the area of a rectangle with length 7.5 and width 4.0.

Calculate the area of a circle with radius 3.0.

Calculate the area of a triangle with base 8 and height 6.5.

Print the result: Print the result of each method call to demonstrate the output.
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Area of the square: 25
Area of the rectangle: 30.0
Area of the circle: 28.274333882308138
Area of the triangle: 26.0
*/

public class MethodOverloadingWithShapeAreaCalculator {

    // Method to calculate area of a square
    public double calculateArea(int side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a triangle
    public double calculateArea(int base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        // Call overloaded methods
        double squareArea = calculator.calculateArea(5);
        double rectangleArea = calculator.calculateArea(7.5, 4.0);
        double circleArea = calculator.calculateArea(3.0);
        double triangleArea = calculator.calculateArea(8, 6.5);

        // Print results
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
