/*
Problem
Create a class Book with private attributes ISBN, title, author, and price. Use getter and setter methods to access and modify these attributes. Your task is to create a Book object, take input from the user to set its attributes using the setter methods, and then display the book's details using the getter methods.

Input Format
The input consists of four lines:
A string representing the ISBN.
A string representing the title.
A string representing the author.
A float representing the price.
Output Format
The output should display the book's information in the following order:
ISBN
title
author
price
Do's
Create the class: Define a class named Book.
Declare private attributes: Inside the class, declare private attributes: ISBN, title, author, and price.
Implement getter methods: Create public getter methods to return the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for ISBN, title, author, and price from user input.
Display output using getter methods: Use the getter methods to display the ISBN, title, author, and price in the specified order.
Sample Inputs & Outputs
Sample Input 1

978-3-16-148410-0
The Great Gatsby
F. Scott Fitzgerald
10.99
Sample Output 1

978-3-16-148410-0
The Great Gatsby
F. Scott Fitzgerald
10.99
*/

import java.util.Scanner;

class Book {
    // Private attributes
    private String ISBN;
    private String title;
    private String author;
    private float price;

    // Setter methods
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter methods
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }
}

public class BookInfoWithEncapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Book object
        Book book = new Book();

        // Take input from user
        book.setISBN(scanner.nextLine());
        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setPrice(Float.parseFloat(scanner.nextLine()));

        // Display book details
        System.out.println(book.getISBN());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());

        scanner.close();
    }
}
