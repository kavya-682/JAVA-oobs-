/*
Problem
Write a Java program that demonstrates polymorphism using abstract classes.

Create an abstract class Shape with a float variable area, an abstract method acceptInput(), an abstract method calcArea(), and a concrete method getArea() that returns the value of the area variable.
Develop three subclasses:
Square: Use a float variable side. Implement the acceptInput() and calcArea() methods, and calculate the area of the square. Override the calcArea() method to compute the area as side * side.
Rectangle: Use float variables length and breadth. Implement the acceptInput() and calcArea() methods, and calculate the area of the rectangle. Override the calcArea() method to compute the area as length * breadth.
Circle: Use a float variable radius. Implement the acceptInput() and calcArea() methods, and calculate the area of the circle. Override the calcArea() method to compute the area as π * radius^2 (where π is Math.PI).
3. In the Main class:

Prompt the user to specify which shape they want to calculate the area for (Square, Rectangle, or Circle).
Use a Shape type reference to point to the appropriate subclass object, demonstrating polymorphism.
Based on the user’s input, create the corresponding object, call the acceptInput() and calcArea() methods, and use the getArea() method to retrieve and display the calculated area.
Input Format
A single line of input specifying the shape type (e.g., "Square", "Rectangle", "Circle").
Depending on the shape type:
For Square: Input a single floating-point number for side.
For Rectangle: Input two floating-point numbers for length and breadth.
For Circle: Input a single floating-point number for radius.
Output Format
Display the calculated area for the selected shape.

Do's
Create an abstract class named Shape with a float variable area.
Define two abstract methods in the Shape class: acceptInput() and calcArea().
Define one concrete method in the Shape class: getArea() that returns the area.
Create subclasses Square, Rectangle, and Circle that extend Shape: Square: Use a float variable side and implement both acceptInput() and calcArea() methods. Rectangle: Use float variables length and breadth and implement both acceptInput() and calcArea() methods. Circle: Use a float variable radius and implement both acceptInput() and calcArea() methods.
Use a Shape type reference to point to the child class objects, demonstrating polymorphism.
In the Main class, prompt the user for the shape type, input the necessary dimensions, create an instance of the corresponding shape, and display the area.
Sample Inputs & Outputs
Sample Input 1

Square
5
Sample Output 1

Area of Square: 25.0
Sample Input 2

Rectangle
5
6
Sample Output 2

Area of Rectangle: 30.0
Sample Input 3

Circle
3
Sample Output 3

Area of Circle: 28.274334

*/

import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    protected float area; // common variable for all shapes

    // Abstract methods
    abstract void acceptInput(Scanner sc);
    abstract void calcArea();

    // Concrete method
    public float getArea() {
        return area;
    }
}

// Square class
class Square extends Shape {
    private float side;

    @Override
    void acceptInput(Scanner sc) {
        side = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = side * side;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private float length, breadth;

    @Override
    void acceptInput(Scanner sc) {
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }
}

// Circle class
class Circle extends Shape {
    private float radius;

    @Override
    void acceptInput(Scanner sc) {
        radius = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = (float) (Math.PI * radius * radius);
    }
}

// Main class
public class PolymorphismUsingAbstractClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shapeType = sc.nextLine().trim();

        Shape shape; // Polymorphic reference

        switch (shapeType.toLowerCase()) {
            case "square":
                shape = new Square();
                shape.acceptInput(sc);
                shape.calcArea();
                System.out.println("Area of Square: " + shape.getArea());
                break;

            case "rectangle":
                shape = new Rectangle();
                shape.acceptInput(sc);
                shape.calcArea();
                System.out.println("Area of Rectangle: " + shape.getArea());
                break;

            case "circle":
                shape = new Circle();
                shape.acceptInput(sc);
                shape.calcArea();
                System.out.println("Area of Circle: " + shape.getArea());
                break;

            default:
                System.out.println("Invalid Shape Type!");
        }

        sc.close();
    }
}
