/*
Problem
Write a Java program that defines a class named Calculator with multiple overloaded divide methods to perform division operations with different numbers and types of parameters. You need to create these methods and call them with the specified values.

Input Format
No input from the user is required.

Output Format
The results of the division operations performed by the overloaded divide methods.

Do's
Create a class: Define a class named Calculator.
Create overloaded methods: Define four divide methods with different parameters inside the Calculator class.
Use method overloading: The methods should have the same name (divide) but different parameter lists.
Call the methods: In the main method, create an instance of the Calculator class and call each of the divide methods with the following values:
Divide 20 by 5 (two integers).

Divide 45.0 by 3.0 by 5.0 (three doubles).

Divide 9.0f by 3.0f 

Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Quotient of two integers: 4
Quotient of three doubles: 3.0
Quotient of two floats: 3.0
Quotient of an integer and a double: 12.0
*/

public class MethodOverloadingForDivision {

    // Method 1: Divide two integers
    public int divide(int a, int b) {
        return a / b;
    }

    // Method 2: Divide three doubles
    public double divide(double a, double b, double c) {
        return a / b / c;
    }

    // Method 3: Divide two floats
    public float divide(float a, float b) {
        return a / b;
    }

    // Method 4: Divide an integer and a double
    public double divide(int a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.divide(20, 5);
        double result2 = calc.divide(45.0, 3.0, 5.0);
        float result3 = calc.divide(9.0f, 3.0f);
        double result4 = calc.divide(24, 2.0);

        System.out.println("Quotient of two integers: " + result1);
        System.out.println("Quotient of three doubles: " + result2);
        System.out.println("Quotient of two floats: " + result3);
        System.out.println("Quotient of an integer and a double: " + result4);
    }
}
