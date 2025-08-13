/*
 * Create a class Book with private attributes ISBN, title, author, and price. Use getter and setter methods to access and modify these attributes. Your task is to create a Book object, take input from the user to set its attributes using the setter methods, and then display the book's details using the getter methods.

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
Constraints
The ISBN must be a valid string.
The title and author should not be empty strings.
The price should be a positive float.
 */
package in.java;
import java.util.Scanner;
public class BookEncapulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();
		// set the data using setters 
		 String ISBN = scanner.nextLine();
		 String title = scanner.nextLine();
		 String author = scanner.nextLine();
		  float price = scanner.nextFloat();
		  
		  book.setISBN(ISBN);
		  book.setTitle(title);
		  book.setAuthor(author);
		  book.setPrice(price);
		  
		  System.out.println(book.getISBN());
		  System.out.println(book.getTitle());
		  System.out.println(book.getAuthor());
		  System.out.println(book.getPrice());
		

	}
}
class Book{
   private String ISBN;
   private String title;
   private String author;
   private float price;
   
   // create setter and getter for ISBN
   public void setISBN(String ISBN) {
	   this.ISBN = ISBN;
   }
   public String getISBN() {
	   return ISBN;
   }
   // create setter and getter for title
   public void setTitle(String title) {
	   this.title=title;
   }
   public String getTitle() {
	   return title;
   }
  // create setter and getter for author
   public void setAuthor(String author) {
	   this.author = author;
   }
   public String getAuthor() {
	   return author;
   }
  // create setter and getter for price
   public void setPrice(float price) {
	   this.price = price;
   }
   public float getPrice() {
	   return price;
   }
	
}
