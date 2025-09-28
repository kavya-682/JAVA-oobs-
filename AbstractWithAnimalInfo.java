/*
Problem
Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal. The program should prompt the user to specify which animal's sound they want to hear (Lion or Tiger), and based on the input, the program should print the corresponding sound.

Input Format
A single line of input specifying either "Lion" or "Tiger."

Output Format
A single line displaying the sound made by the selected animal.

Do's
Create an abstract class named Animal with an abstract method sound().
Create subclasses Lion and Tiger that extend Animal.
Implement the sound() method in both subclasses with the appropriate sound for each animal: Lion: Print "Roar". Tiger: Print "Growl".
Ensure the user can input either "Lion" or "Tiger" to hear the correct sound.
mplement the main method to take input from the user, create the appropriate object (either Lion or Tiger), and call the sound() method.
Sample Inputs & Outputs
Sample Input 1

Lion
Sample Output 1

Roar
Sample Input 2

Tiger
Sample Output 2

Growl
*/

import java.util.Scanner;

// Abstract class
abstract class Animal {
    abstract void sound();
}

// Lion subclass
class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Roar");
    }
}

// Tiger subclass
class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Growl");
    }
}

public class AbstractWithAnimalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        Animal animal;

        if (input.equalsIgnoreCase("Lion")) {
            animal = new Lion();
        } else if (input.equalsIgnoreCase("Tiger")) {
            animal = new Tiger();
        } else {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        animal.sound();
        sc.close();
    }
}
