/*
Problem
Create a class `Animal` with private attributes `name` and `age`. It should have methods to set and get these attributes. Additionally, it should have a method `getSound()` which returns an empty string.



Derive a class `Dog` from `Animal`, adding an attribute `breed`. It should override the `getSound()` method to return "Bark".



Derive another class named `Cat` from `Animal`, adding an attribute `color`. It should override the `getSound()` method to return "Meow".



Write a program that asks the user which type of animal needs to be created. According to the user's choice, collect the details from the user and display the sound of the respective animal.

Input Format
- The first line contains the type of animal ("Dog" or "Cat").

- The second line contains a comma-separated list of the attributes for the animal.

  - For a Dog: name,age,breed

  - For a Cat: name,age,color

Output Format
- A single line displaying the sound of the animal in the format: `Sound of <AnimalType>: <Sound>`

Do's
Create a base class named Animal.
Use private variables in the Animal class named name and age.
Create a subclass named Dog using inheritance.
Use a private variable in the Dog class named breed.
Create a subclass named Cat using inheritance.
Use a private variable in the Cat class named color.
Override the getSound() method in Dog and Cat.
Create appropriate public getters and setters for variables in Animal, Dog, and Cat.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Dog
Buddy,3,Golden Retriever
Sample Output 1

Sound of Dog: Bark
Sample Input 2

Cat
Whiskers,2,White
Sample Output 2

Sound of Cat: Meow
*/

import java.util.Scanner;

class Animal {
    private String name;
    private int age;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Method to be overridden
    public String getSound() {
        return "";
    }
}

class Dog extends Animal {
    private String breed;

    // Getter and Setter
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override
    @Override
    public String getSound() {
        return "Bark";
    }
}

class Cat extends Animal {
    private String color;

    // Getter and Setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Override
    @Override
    public String getSound() {
        return "Meow";
    }
}

public class AnimalInfoUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animalType = sc.nextLine().trim();
        String[] attributes = sc.nextLine().split(",");

        if (animalType.equalsIgnoreCase("Dog")) {
            Dog dog = new Dog();
            dog.setName(attributes[0].trim());
            dog.setAge(Integer.parseInt(attributes[1].trim()));
            dog.setBreed(attributes[2].trim());
            System.out.println("Sound of Dog: " + dog.getSound());
        } else if (animalType.equalsIgnoreCase("Cat")) {
            Cat cat = new Cat();
            cat.setName(attributes[0].trim());
            cat.setAge(Integer.parseInt(attributes[1].trim()));
            cat.setColor(attributes[2].trim());
            System.out.println("Sound of Cat: " + cat.getSound());
        } else {
            System.out.println("Unknown animal type");
        }

        sc.close();
    }
}
