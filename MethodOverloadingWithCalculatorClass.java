/*
Problem
Write a Java program that defines a class named Calculator with multiple overloaded add methods to perform addition operations with different numbers and types of parameters. In the main method, create an object of the Calculator class and call these add methods with different types of input to demonstrate method overloading.

Input Format
No input from the user is required.

Output Format
The results of the addition operations performed by the overloaded add methods.

Do's
Create a class: Define a class named Calculator.
Create overloaded methods: Define four add methods with different parameters inside the Calculator class.
Use method overloading: The methods should have the same name (add) but different parameter lists.
Include different numeric types: Implement one add method that accepts one integer and one double as parameters.
Call the methods: In the main method, create an instance of the Calculator class and call each of the add methods, passing appropriate arguments.
Print the result: Print the result of each method call to demonstrate the output.
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Sum of two integers: 15
Sum of three doubles: 13.5
Sum of two floats: 6.0
Sum of an integer and a double: 11.5

*/

// Class name: Calculator demonstrating method overloading
class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three doubles
    double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method 3: Add two floats
    float add(float a, float b) {
        return a + b;
    }

    // Method 4: Add one integer and one double
    double add(int a, double b) {
        return a + b;
    }
}

// Main class
public class MethodOverloadingWithCalculatorClass {
    public static void main(String[] args) {
        // Create an object of Calculator
        Calculator calc = new Calculator();

        // Call different overloaded methods
        int sum1 = calc.add(10, 5);
        double sum2 = calc.add(4.5, 5.0, 4.0);
        float sum3 = calc.add(2.5f, 3.5f);
        double sum4 = calc.add(6, 5.5);

        // Print the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three doubles: " + sum2);
        System.out.println("Sum of two floats: " + sum3);
        System.out.println("Sum of an integer and a double: " + sum4);
    }
}
