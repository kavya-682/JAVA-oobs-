/*
Problem
Write a Java program to model the relationships between a Student, Brain, Heart, Book, and Bike. The Student class has a tight bound relationship with Brain and Heart (composition), and a loose bound relationship with Book and Bike (aggregation). The Student class should be able to access attributes of Brain and Heart directly, and interact with Book and Bike using methods.

Heart has attributes weight and bpm.
Brain has attributes weight and colour.
Bike has attributes brand and mileage.
Book has attributes name and author.
Create a Student class that initializes Heart and Brain with specific values. The Student class should also have methods to access Book and Bike details. Use the following values for initialization:

Heart with weight 289 and bpm 72.
Brain with weight 1400 and colour grey.
For Book, use name as Java and author as JG.
For Bike, use brand as Duke and mileage as 35.
Write a program that demonstrates the creation of these objects and prints their details.

Input Format
No input from the user is required for this question. The values are hardcoded as specified in the question statement.

Output Format
Print the details in the following order :

<Heart weight>

<Heart bpm>

<Brain weight>

<Brain colour>

<Bike brand>

<Bike mileage>

<Book name>

<Book author>

Do's
Create a class named Heart with private attributes weight (int) and bpm (int). Include appropriate getters for these attributes.
Create a class named Brain with private attributes weight (int) and colour (String). Include appropriate getters for these attributes.
Create a class named Bike with private attributes brand (String) and mileage (int). Include appropriate getters for these attributes.
Create a class named Book with private attributes name (String) and author (String). Include appropriate getters for these attributes.
Create a class named Student with a composition relationship to Heart and Brain, and an aggregation relationship to Book and Bike.
In the Student class, instantiate the Heart and Brain objects as instance variables, representing composition. This means the Heart and Brain objects are tightly bound to the Student object.
Define methods in the Student class that take Book and Bike objects as parameters and print their attributes, illustrating aggregation. The Book and Bike objects can exist independently of the Student object.
Implement a main method that demonstrates the usage of these classes. Create instances of Book, Bike, and Student, and show the relationships and interactions.
Ensure that the Student class's Heart and Brain are instantiated within its constructor or as default values to reflect composition, whereas Book and Bike should be passed to methods or instantiated separately to reflect aggregation.
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

289
72
1400
grey
Duke
35
Java
JG
*/

// Heart class - Composition
class Heart {
    private int weight;
    private int bpm;

    public Heart(int weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }

    // Getters
    public int getWeight() {
        return weight;
    }

    public int getBpm() {
        return bpm;
    }
}

// Brain class - Composition
class Brain {
    private int weight;
    private String colour;

    public Brain(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    // Getters
    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}

// Bike class - Aggregation
class Bike {
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }
}

// Book class - Aggregation
class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}

// Student class
class Student {
    // Composition: tightly bound objects
    private Heart heart;
    private Brain brain;

    public Student() {
        // Initialize Heart and Brain as composition
        this.heart = new Heart(289, 72);
        this.brain = new Brain(1400, "grey");
    }

    // Getters for Heart and Brain
    public Heart getHeart() {
        return heart;
    }

    public Brain getBrain() {
        return brain;
    }

    // Aggregation: interact with Book
    public void printBookDetails(Book book) {
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }

    // Aggregation: interact with Bike
    public void printBikeDetails(Bike bike) {
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());
    }
}

// Main class
public class AggregationCompositionUsingStudentHeartBrainBookAndBike  {
    public static void main(String[] args) {
        // Create Student object (composition objects created inside)
        Student student = new Student();

        // Print Heart details
        System.out.println(student.getHeart().getWeight());
        System.out.println(student.getHeart().getBpm());

        // Print Brain details
        System.out.println(student.getBrain().getWeight());
        System.out.println(student.getBrain().getColour());

        // Create Bike and Book objects (aggregation)
        Bike bike = new Bike("Duke", 35);
        Book book = new Book("Java", "JG");

        // Print Bike and Book details using Student methods
        student.printBikeDetails(bike);
        student.printBookDetails(book);
    }
}
