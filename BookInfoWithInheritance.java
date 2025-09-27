/*
Problem
Create a class Book with private attributes title and author. The class should include methods to set and get these attributes. Additionally, it should have a method getInfo() that returns a string containing the book's details.

Derive a class EBook from Book, adding an attribute fileSize. The EBook class should override the getInfo() method to include the file size in the book details.

Write a program that prompts the user to enter the details of an EBook object, and then displays the details of the ebook using the getInfo() method.

Input Format
A single line containing the details of the ebook as a comma-separated string in the following order: title, author, fileSize.

Output Format
A single line displaying the ebook details in the format: EBook Info: Title: <title>, Author: <author>, File Size: <fileSize>.

Do's
Create a base class named Book.
Use private variables title and author in the Book class.
Create a subclass named EBook using inheritance.
Use a private variable fileSize in the EBook class.
Override the getInfo() method in the EBook class.
Create appropriate public getters and setters for the variables in both Book and EBook classes.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

1984,George Orwell,2MB
Sample Output 1

EBook Info: Title: 1984, Author: George Orwell, File Size: 2MB
Sample Input 2

Brave New World,Aldous Huxley,3MB
Sample Output 2

EBook Info: Title: Brave New World, Author: Aldous Huxley, File Size: 3MB
*/

import java.util.Scanner;

// Base class Book
class BookInfoWithInheritance {
    private String title;
    private String author;

    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get book info
    public String getInfo() {
        return "Title: " + title + ", Author: " + author;
    }
}

// Subclass EBook
class EBook extends Book {
    private String fileSize;

    // Getter and Setter
    public String getFileSize() {
        return fileSize;
    }
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    // Override getInfo
    @Override
    public String getInfo() {
        return "EBook Info: Title: " + getTitle() +
               ", Author: " + getAuthor() +
               ", File Size: " + fileSize;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: title,author,fileSize
        String input = sc.nextLine();
        String[] details = input.split(",");

        // Create EBook object
        EBook ebook = new EBook();
        ebook.setTitle(details[0].trim());
        ebook.setAuthor(details[1].trim());
        ebook.setFileSize(details[2].trim());

        // Display ebook info
        System.out.println(ebook.getInfo());

        sc.close();
    }
}
