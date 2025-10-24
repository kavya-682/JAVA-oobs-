/*
Problem
Write a Java program that defines a class named ShapePerimeterCalculator with multiple overloaded calculatePerimeter methods to compute the perimeter of different shapes using various parameters. You need to create these methods and call them with the specified values.

Input Format
No input from the user is required.

Output Format
The results of the perimeter calculations performed by the overloaded calculatePerimeter methods.

Do's
Create a class: Define a class named ShapePerimeterCalculator.
Create overloaded methods: Define four calculatePerimeter methods with different parameters inside the ShapePerimeterCalculator class.
Use method overloading: The methods should have the same name (calculatePerimeter) but different parameter lists.
Call the methods: In the main method, create an instance of the ShapePerimeterCalculator class and call each of the calculatePerimeter methods with the following values:
Calculate the perimeter of a square with side length 4.

Calculate the perimeter of a rectangle with length 7.5 and width 3.5.

Calculate the perimeter of a circle with radius 2.0.

Calculate the perimeter of a triangle with sides 3, 4, and 5.

Print the result: Print the result of each method call to demonstrate the output.
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Perimeter of the square: 16
Perimeter of the rectangle: 22.0
Perimeter of the circle: 12.566370614359172
Perimeter of the triangle: 12
*/

// ShapePerimeterCalculator.java
class MethodOverloadingShapePerimeterCalculator {

    // Method to calculate perimeter of a square
    double calculatePerimeter(int side) {
        return 4 * side;
    }

    // Method to calculate perimeter of a rectangle
    double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to calculate perimeter of a circle
    double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // Method to calculate perimeter of a triangle
    double calculatePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        // Create an object of ShapePerimeterCalculator
        ShapePerimeterCalculator spc = new ShapePerimeterCalculator();

        // Call overloaded methods
        double squarePerimeter = spc.calculatePerimeter(4);
        double rectanglePerimeter = spc.calculatePerimeter(7.5, 3.5);
        double circlePerimeter = spc.calculatePerimeter(2.0);
        double trianglePerimeter = spc.calculatePerimeter(3, 4, 5);

        // Print the results
        System.out.println("Perimeter of the square: " + squarePerimeter);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
        System.out.println("Perimeter of the circle: " + circlePerimeter);
        System.out.println("Perimeter of the triangle: " + trianglePerimeter);
    }
}
