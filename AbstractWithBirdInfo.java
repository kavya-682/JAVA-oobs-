/*
Problem
Write a Java program to create an abstract class Bird with two abstract methods: fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class. Implement the fly() and makeSound() methods in each subclass to describe how each bird flies and makes a sound.

Input Format
The user will input either Eagle or Hawk to display the respective bird's flight and sound characteristics.

Output Format
The program will print specific information about how the bird flies and the sound it makes based on the user's input.

Do's
Create an abstract class named Bird with two abstract methods: fly() and makeSound()
Create subclasses Eagle and Hawk that extend the Bird class.
In each subclass, implement the fly() method to describe the specific flying pattern of the bird: Eagle: "soaring at great heights" Hawk: "flying swiftly over the plains"
In each subclass, implement the makeSound() method to describe the specific sound of the bird: Eagle: "makes a sharp, piercing sound" Hawk: "makes a screeching sound"
Use abstraction to define shared characteristics and behavior of all birds, but allow specific implementations for each bird type.
Sample Inputs & Outputs
Sample Input 1

Eagle
Sample Output 1

Eagle is soaring at great heights.
Eagle makes a sharp, piercing sound.
Sample Input 2

Hawk
Sample Output 2

Hawk is flying swiftly over the plains.
Hawk makes a screeching sound.

*/

import java.util.Scanner;

// Abstract class Bird
abstract class Bird {
    // Abstract methods
    public abstract void fly();
    public abstract void makeSound();
}

// Subclass Eagle
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle is soaring at great heights.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle makes a sharp, piercing sound.");
    }
}

// Subclass Hawk
class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk is flying swiftly over the plains.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk makes a screeching sound.");
    }
}

// Main class
public class AbstractWithBirdInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        Bird bird;

        if (input.equalsIgnoreCase("Eagle")) {
            bird = new Eagle();
        } else if (input.equalsIgnoreCase("Hawk")) {
            bird = new Hawk();
        } else {
            System.out.println("Invalid input! Please enter Eagle or Hawk.");
            sc.close();
            return;
        }

        bird.fly();
        bird.makeSound();

        sc.close();
    }
}
