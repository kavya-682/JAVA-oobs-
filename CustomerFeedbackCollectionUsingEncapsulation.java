/*
Problem
Design a class Feedback with private attributes customerId, feedbackText, and rating. Implement getter and setter methods to ensure encapsulation. Write a program that collects feedback from the user, stores the information in a Feedback object, and then displays the feedback's details using the getter methods.

Input Format
The input consists of three lines:

An integer representing the customerId.
A string representing the feedbackText.
An integer representing the rating (1-5).
Output Format
The output should display the feedback's information in the following order:

customerId
feedbackText
rating
Do's
Create the class: Define a class named Feedback.
Declare private attributes: Inside the class, declare private attributes: customerId, feedbackText, and rating.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for customerId, feedbackText, and rating from user input.
Display output using getter methods: Use the getter methods to display the feedback information in the specified order.
Sample Inputs & Outputs
Sample Input 1

101
Excellent service!
5
Sample Output 1

101
Excellent service!
5

*/
import java.util.Scanner;

// Define the Feedback class
class Feedback {
    // Private attributes
    private int customerId;
    private String feedbackText;
    private int rating;

    // Getter methods
    public int getCustomerId() {
        return customerId;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public int getRating() {
        return rating;
    }

    // Setter methods
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) { // Ensure rating is between 1 and 5
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Must be between 1 and 5.");
            this.rating = 0;
        }
    }
}

// Main class
public class CustomerFeedbackCollectionUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Feedback object
        Feedback feedback = new Feedback();

        // Take user input
        System.out.println("Enter Customer ID:");
        int customerId = Integer.parseInt(sc.nextLine());
        feedback.setCustomerId(customerId);

        System.out.println("Enter Feedback Text:");
        String feedbackText = sc.nextLine();
        feedback.setFeedbackText(feedbackText);

        System.out.println("Enter Rating (1-5):");
        int rating = Integer.parseInt(sc.nextLine());
        feedback.setRating(rating);

        // Display feedback details using getter methods
        System.out.println(feedback.getCustomerId());
        System.out.println(feedback.getFeedbackText());
        System.out.println(feedback.getRating());

        sc.close();
    }
}
