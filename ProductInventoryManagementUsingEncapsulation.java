/*
Problem
Build a Product class with private attributes productId, productName, quantity, and price. Implement getter and setter methods to ensure encapsulation. Write a program that reads product details from the user, sets these details in a Product object, and prints the product's information using the getter methods.

Input Format
The input consists of four lines:
An integer representing the productId.
A string representing the productName.
An integer representing the quantity.
A float representing the price.
Output Format
The output should display the product's information in the following order:
productId
productName
quantity
price
Do's
Create the class: Define a class named Product.
Declare private attributes: Inside the class, declare private attributes: productId, productName, quantity, and price.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for productId, productName, quantity, and price from user input.
Display output using getter methods: Use the getter methods to display the product's information in the specified order.
Sample Inputs & Outputs
Sample Input 1

1001
Laptop
10
59999.99
Sample Output 1

1001
Laptop
10
59999.99
*/

import java.util.Scanner;

class Product {
    // Private attributes
    private int productId;
    private String productName;
    private int quantity;
    private float price;

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }
}

public class ProductInventoryManagementUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Product object
        Product product = new Product();

        // Read input from user
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        int qty = sc.nextInt();
        float price = sc.nextFloat();

        // Set values using setter methods
        product.setProductId(id);
        product.setProductName(name);
        product.setQuantity(qty);
        product.setPrice(price);

        // Display product details using getter methods
        System.out.println(product.getProductId());
        System.out.println(product.getProductName());
        System.out.println(product.getQuantity());
        System.out.println(product.getPrice());

        sc.close();
    }
}
