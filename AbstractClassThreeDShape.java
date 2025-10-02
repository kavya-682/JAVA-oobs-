/*
Problem
Write a Java program that creates an abstract class ThreeDShape with a float variable volume and two abstract methods: acceptInput() and calcVolume(). Create three subclasses: Cube, Cylinder, and Sphere. Each subclass should have specific float variables (side for Cube, radius and height for Cylinder, radius for Sphere) and provide the body for both acceptInput() and calcVolume() methods. In the Main class, the user should first input which 3D shape they want to calculate the volume for (Cube, Cylinder, or Sphere), and based on the input, use the parent class ThreeDShape reference to point to the corresponding child class object, demonstrating polymorphism.

Input Format
First input: A string specifying the shape (Cube, Cylinder, or Sphere).

Subsequent inputs: Values for the shape's dimensions (e.g., side for Cube, radius and height for Cylinder, radius for Sphere).

Output Format
Display the calculated volume for the selected shape.

Do's
Create an abstract class named ThreeDShape with a float variable volume.
Define two abstract methods in the ThreeDShape class: acceptInput() and calcVolume().
Create subclasses Cube, Cylinder, and Sphere that extend ThreeDShape: Cube: Use a float variable side and implement both methods. Cylinder: Use float variables radius and height and implement both methods. Sphere: Use a float variable radius and implement both methods.
Use the ThreeDShape type reference to point to the child class objects, demonstrating polymorphism.
In the Main class, the user should first input which shape they want to calculate the volume for, then based on the input, use a ThreeDShape reference to create the corresponding object, call its methods to accept input, calculate the volume, and display it.
Sample Inputs & Outputs
Sample Input 1

Cube
4
Sample Output 1

Volume of Cube: 64.00
Sample Input 2

Cylinder
3
7
Sample Output 2

Volume of Cylinder: 197.92
Sample Input 3

Sphere
5
Sample Output 3

Volume of Sphere: 523.60

*/
import java.util.Scanner;

// Abstract class
abstract class ThreeDShape {
    protected float volume;

    // Abstract methods
    public abstract void acceptInput(Scanner sc);
    public abstract void calcVolume();

    // Concrete method
    public float getVolume() {
        return volume;
    }
}

// Cube subclass
class Cube extends ThreeDShape {
    private float side;

    @Override
    public void acceptInput(Scanner sc) {
        side = sc.nextFloat();
    }

    @Override
    public void calcVolume() {
        volume = side * side * side;
    }
}

// Cylinder subclass
class Cylinder extends ThreeDShape {
    private float radius, height;

    @Override
    public void acceptInput(Scanner sc) {
        radius = sc.nextFloat();
        height = sc.nextFloat();
    }

    @Override
    public void calcVolume() {
        volume = (float) (Math.PI * radius * radius * height);
    }
}

// Sphere subclass
class Sphere extends ThreeDShape {
    private float radius;

    @Override
    public void acceptInput(Scanner sc) {
        radius = sc.nextFloat();
    }

    @Override
    public void calcVolume() {
        volume = (float) ((4.0 / 3.0) * Math.PI * radius * radius * radius);
    }
}

// Main class
public class AbstractClassThreeDShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shapeType = sc.nextLine();  // Read which shape

        ThreeDShape shape = null;

        if (shapeType.equalsIgnoreCase("Cube")) {
            shape = new Cube();
        } else if (shapeType.equalsIgnoreCase("Cylinder")) {
            shape = new Cylinder();
        } else if (shapeType.equalsIgnoreCase("Sphere")) {
            shape = new Sphere();
        } else {
            System.out.println("Invalid Shape!");
            sc.close();
            return;
        }

        // Polymorphic behavior
        shape.acceptInput(sc);
        shape.calcVolume();

        // Output formatted to 2 decimal places
        System.out.printf("Volume of %s: %.2f\n", shapeType, shape.getVolume());

        sc.close();
    }
}
