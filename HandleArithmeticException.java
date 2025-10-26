/*
Problem
Write a Java program that performs a division of two numbers. If the user tries to divide by zero, the program should throw an ArithmeticException. Catch the exception using a try-catch block and print a message "Cannot divide by zero" when the exception is caught.

Input Format
The first line contains an integer, which is the numerator.

The second line contains an integer, which is the denominator.

Output Format
If the division is successful, print the result.

If an ArithmeticException is thrown, catch it and print "Cannot divide by zero."

Do's
Use a try-catch block to handle the ArithmeticException.
Print the message "Cannot divide by zero" when the exception occurs.
Use integer division.
Sample Inputs & Outputs
Sample Input 1

10
2
Sample Output 1

5
Sample Input 2

8
0
Sample Output 2

Cannot divide by zero
*/
import java.util.Scanner;

public class HandleArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read numerator and denominator
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            // Attempt division
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}
