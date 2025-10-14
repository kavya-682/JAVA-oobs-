/*
Problem
Create a class Review with private attributes reviewId, productName, reviewerName, and reviewText. Implement getter and setter methods to enforce encapsulation. Write a program that takes review details as input from the user, stores the information in a Review object, and displays the review's details using the getter methods.

Input Format
The input consists of four lines:

An integer representing the reviewId.
A string representing the productName.
A string representing the reviewerName.
A string representing the reviewText.
Output Format
The output should display the review's information in the following order:

reviewId
productName
reviewerName
reviewText
Do's
Create the class: Define a class named Review.
Declare private attributes: Inside the class, declare private attributes: reviewId, productName, reviewerName, and reviewText.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for reviewId, productName, reviewerName, and reviewText from user input.
Display output using getter methods: Use the getter methods to display the review information in the specified order.
Sample Inputs & Outputs
Sample Input 1

101
Wireless Headphones
John Smith
Great sound quality and battery life.
Sample Output 1

101
Wireless Headphones
John Smith
Great sound quality and battery life.

*/
import java.util.Scanner;

class Review {
    // Private attributes
    private int reviewId;
    private String productName;
    private String reviewerName;
    private String reviewText;

    // Setter methods
    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    // Getter methods
    public int getReviewId() {
        return reviewId;
    }

    public String getProductName() {
        return productName;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public String getReviewText() {
        return reviewText;
    }
}

public class ProductReviewSubmissionAndDisplayUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Review object
        Review review = new Review();

        // Take input and set values
        int reviewId = Integer.parseInt(sc.nextLine());
        String productName = sc.nextLine();
        String reviewerName = sc.nextLine();
        String reviewText = sc.nextLine();

        review.setReviewId(reviewId);
        review.setProductName(productName);
        review.setReviewerName(reviewerName);
        review.setReviewText(reviewText);

        // Display output using getter methods
        System.out.println(review.getReviewId());
        System.out.println(review.getProductName());
        System.out.println(review.getReviewerName());
        System.out.println(review.getReviewText());

        sc.close();
    }
}
