/*
Problem
Write a Java program to create an abstract class Animal with two abstract methods: eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class. Implement the eat() and sleep() methods in each subclass to reflect the specific behaviors of these animals, such as what they eat and how they sleep.

Input Format
The user will specify which animal they want to see details about: Lion, Tiger, or Deer.

Output Format
Based on the user's input, the program should display specific messages about the animal's eating and sleeping behavior.

Do's
Create an abstract class named Animal with two abstract methods: eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class.
In each subclass, implement the eat() method to display specific eating habits of the animal: Lion and Tiger: "eating meat" Deer: "eating grass"
In each subclass, implement the sleep() method to show specific sleeping patterns: Lion: "sleeps in its den for 8 hours" Tiger: "sleeps under a tree for 7 hours" Deer: "sleeps in the forest for 6 hours"
Use the Animal type reference to point to child class objects, demonstrating polymorphism.
Allow the user to choose between Lion, Tiger, and Deer to display specific behaviors.
Sample Inputs & Outputs
Sample Input 1

Lion
Sample Output 1

Lion is eating meat.
Lion sleeps in its den for 8 hours.
Sample Input 2

Deer
Sample Output 2

Deer is eating grass.
Deer sleeps in the forest for 6 hours.
Sample Input 3

Tiger
Sample Output 3

Tiger is eating meat.
Tiger sleeps under a tree for 7 hours.
*/
import java.util.Scanner;

// Abstract class
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

// Lion subclass
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion is eating meat.");
    }
    @Override
    void sleep() {
        System.out.println("Lion sleeps in its den for 8 hours.");
    }
}

// Tiger subclass
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger is eating meat.");
    }
    @Override
    void sleep() {
        System.out.println("Tiger sleeps under a tree for 7 hours.");
    }
}

// Deer subclass
class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer is eating grass.");
    }
    @Override
    void sleep() {
        System.out.println("Deer sleeps in the forest for 6 hours.");
    }
}

public class AbstracClassWithTwoAbstractMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        Animal animal;

        if (input.equalsIgnoreCase("Lion")) {
            animal = new Lion();
        } else if (input.equalsIgnoreCase("Tiger")) {
            animal = new Tiger();
        } else if (input.equalsIgnoreCase("Deer")) {
            animal = new Deer();
        } else {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        // Polymorphism in action
        animal.eat();
        animal.sleep();

        sc.close();
    }
}
