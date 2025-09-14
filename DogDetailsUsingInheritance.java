/*
Problem
Create a class Animal with private attributes name and species. It should have methods to set and get these attributes. Additionally, it should have a method getInfo() which returns a string with animal details.

Derive a class Mammal from Animal, adding an attribute isDomesticated. It should override the getInfo() method to include whether the mammal is domesticated.

Derive another class named Dog from Mammal, adding an attribute breed. It should override the getInfo() method to include the breed in the mammal details.

Write a program that asks the user to create a Dog object, collects the details from the user, and displays the dog details.

Input Format
The first line contains the dog details in the format: name,species,isDomesticated,breed.

Output Format
A single line displaying the dog details in the format:

Dog Details: Name: <Name>, Species: <Species>, Domesticated: <IsDomesticated>, Breed: <Breed>.

Do's
Create a base class named Animal.
Use private variables in the Animal class named name and species.
Create a subclass named Mammal using inheritance.
Use a private variable in the Mammal class named isDomesticated.
Create a subclass named Dog using inheritance.
Use a private variable in the Dog class named breed.
Override the getInfo() method in Mammal and Dog.
Create appropriate public getters and setters for variables in Animal, Mammal, and Dog.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Buddy,Canine,true,Golden Retriever
Sample Output 1

Dog Details: Name: Buddy, Species: Canine, Domesticated: true, Breed: Golden Retriever
Sample Input 2

Max,Canine,true,German Shepherd
Sample Output 2

Problem
Create a class Animal with private attributes name and species. It should have methods to set and get these attributes. Additionally, it should have a method getInfo() which returns a string with animal details.

Derive a class Mammal from Animal, adding an attribute isDomesticated. It should override the getInfo() method to include whether the mammal is domesticated.

Derive another class named Dog from Mammal, adding an attribute breed. It should override the getInfo() method to include the breed in the mammal details.

Write a program that asks the user to create a Dog object, collects the details from the user, and displays the dog details.

Input Format
The first line contains the dog details in the format: name,species,isDomesticated,breed.

Output Format
A single line displaying the dog details in the format:

Dog Details: Name: <Name>, Species: <Species>, Domesticated: <IsDomesticated>, Breed: <Breed>.

Do's
Create a base class named Animal.
Use private variables in the Animal class named name and species.
Create a subclass named Mammal using inheritance.
Use a private variable in the Mammal class named isDomesticated.
Create a subclass named Dog using inheritance.
Use a private variable in the Dog class named breed.
Override the getInfo() method in Mammal and Dog.
Create appropriate public getters and setters for variables in Animal, Mammal, and Dog.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Buddy,Canine,true,Golden Retriever
Sample Output 1

Dog Details: Name: Buddy, Species: Canine, Domesticated: true, Breed: Golden Retriever
Sample Input 2

Max,Canine,true,German Shepherd DogDetailsUsingInheritance
Sample Output 2

Dog Details: Name: Max, Species: Canine, Domesticated: true, Breed: German Shepherd: Name: Max, Species: Canine, Domesticated: true, Breed: German Shepherd
*/

import java.util.Scanner;

class Animal {
    private String name;
    private String species;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() <= 50) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species != null && species.length() <= 50) {
            this.species = species;
        } else {
            throw new IllegalArgumentException("Invalid species");
        }
    }

    public String getInfo() {
        return "Name: " + name + ", Species: " + species;
    }
}

class Mammal extends Animal {
    private boolean isDomesticated;

    // Getter and Setter
    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Domesticated: " + isDomesticated;
    }
}

class Dog extends Mammal {
    private String breed;

    // Getter and Setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed != null && breed.length() <= 50) {
            this.breed = breed;
        } else {
            throw new IllegalArgumentException("Invalid breed");
        }
    }

    @Override
    public String getInfo() {
        return "Dog Details: " + super.getInfo() + ", Breed: " + breed;
    }
}

public class DogDetailsUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (parts.length != 4) {
                throw new IllegalArgumentException("Input format is incorrect.");
            }

            String name = parts[0].trim();
            String species = parts[1].trim();
            boolean isDomesticated = Boolean.parseBoolean(parts[2].trim());
            String breed = parts[3].trim();

            Dog dog = new Dog();
            dog.setName(name);
            dog.setSpecies(species);
            dog.setDomesticated(isDomesticated);
            dog.setBreed(breed);

            System.out.println(dog.getInfo());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
