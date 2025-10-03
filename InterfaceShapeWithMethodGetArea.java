/*
Problem
Write a Java program to create an interface Shape with a method getArea(). Create three classes: Rectangle, Circle, and Triangle, each implementing the Shape interface. Implement the getArea() method for each class based on the respective shape’s area formula. In the Main class, prompt the user to specify which shape they want to calculate the area for, and then input the dimensions of the selected shape. Display the calculated area.

Input Format
A single line of input specifying the shape type (e.g., "Rectangle", "Circle", "Triangle").

Based on the shape type, the program will prompt for specific dimensions:

For Rectangle: Input two floating-point numbers representing length and width.
For Circle: Input one floating-point number representing radius.
For Triangle: Input two floating-point numbers representing base and height.
Output Format
Display the calculated area of the selected shape.

Do's
Create an interface named Shape with a method getArea().
Implement the Shape interface in three classes: Rectangle, Circle, and Triangle.
In the Rectangle class, calculate the area using the formula length * width.
In the Circle class, calculate the area using the formula π * radius * radius.
In the Triangle class, calculate the area using the formula 0.5 * base * height.
In the Main class, prompt the user to specify the shape type, input the necessary dimensions, create instances of the shape classes, and display the area.
Sample Inputs & Outputs
Sample Input 1

Rectangle
5
3
Sample Output 1

Area of Rectangle: 15.00
Sample Input 2

Circle
4
Sample Output 2

Area of Circle: 50.27
Sample Input 3

Triangle
6
4
Sample Output 3

Area of Triangle: 12.00
*/
import java.util.Scanner;

// Interface
interface Shape {
    double getArea();
}

// Rectangle class
class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class
class Triangle implements Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class InterfaceShapeWithMethodGetArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shapeType = sc.nextLine(); // Read shape type
        Shape shape = null;

        switch (shapeType.toLowerCase()) {
            case "rectangle":
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                shape = new Rectangle(length, width);
                break;

            case "circle":
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;

            case "triangle":
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                shape = new Triangle(base, height);
                break;

            default:
                System.out.println("Invalid Shape!");
                sc.close();
                return;
        }

        // Display result formatted to 2 decimal places
        System.out.printf("Area of %s: %.2f\n", 
                          shapeType, shape.getArea());

        sc.close();
    }
}
