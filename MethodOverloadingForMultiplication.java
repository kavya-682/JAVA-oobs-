/*
Problem
Write a Java program that defines a class named Calculator with multiple overloaded multiply methods to perform multiplication operations with different numbers and types of parameters. You need to create these methods and call them with the specified values.

Input Format
No input from the user is required.

Output Format
The results of the multiplication operations performed by the overloaded multiply methods.

Do's
Create a class: Define a class named Calculator.
Create overloaded methods: Define four multiply methods with different parameters inside the Calculator class.
Use method overloading: The methods should have the same name (multiply) but different parameter lists.
Call the methods: In the main method, create an instance of the Calculator class and call each of the multiply methods with the following values:
Multiply 5 and 10 (two integers).

Multiply 1.5, 2.5, and 3.5 (three doubles).

Multiply 2.5f and 4.5f (two floats).

Multiply 6 (integer) and 3.5 (double).

Print the result: Print the result of each method call to demonstrate the output.
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Product of two integers: 50
Product of three doubles: 13.125
Product of two floats: 11.25
Product of an integer and a double: 21.0
*/
class Calculator {

    // Method 1: Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method 2: Multiply three doubles
    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

    // Method 3: Multiply two floats
    public float multiply(float a, float b) {
        return a * b;
    }

    // Method 4: Multiply an integer and a double
    public double multiply(int a, double b) {
        return a * b;
    }
}

public class MethodOverloadingForMultiplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling each multiply method
        int result1 = calc.multiply(5, 10);
        double result2 = calc.multiply(1.5, 2.5, 3.5);
        float result3 = calc.multiply(2.5f, 4.5f);
        double result4 = calc.multiply(6, 3.5);

        // Printing results
        System.out.println("Product of two integers: " + result1);
        System.out.println("Product of three doubles: " + result2);
        System.out.println("Product of two floats: " + result3);
        System.out.println("Product of an integer and a double: " + result4);
    }
}
