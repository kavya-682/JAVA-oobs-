/*
Problem
Write a Java program that defines a class named Calculator with multiple overloaded subtract methods to perform subtraction operations with different numbers and types of parameters. In the main method, create an object of the Calculator class and call these subtract methods with different types of input to demonstrate method overloading.

Input Format
No input from the user is required.

Output Format
The results of the subtraction operations performed by the overloaded subtract methods.

Do's
Create a class: Define a class named Calculator.
Create overloaded methods: Define four subtract methods with different parameters inside the Calculator class.
Use method overloading: The methods should have the same name (subtract) but different parameter lists.
Include different numeric types: Implement one subtract method that subtracts a double from an integer.
Call the methods: In the main method, create an instance of the Calculator class and call each of the subtract methods, passing appropriate arguments.
Print the result: Print the result of each method call to demonstrate the output.
Sample Inputs & Outputs
Sample Input 1

 
Sample Output 1

Difference of two integers: 10
Difference of three doubles: 4.0
Difference of two floats: 4.0
Difference of an integer and a double: 7.5
*/
// Program to demonstrate method overloading using subtraction

class Calculator {

    // 1. Subtract two integers
    int subtract(int a, int b) {
        return a - b;
    }

    // 2. Subtract three doubles
    double subtract(double a, double b, double c) {
        return a - b - c;
    }

    // 3. Subtract two floats
    float subtract(float a, float b) {
        return a - b;
    }

    // 4. Subtract a double from an integer
    double subtract(int a, double b) {
        return a - b;
    }
}

public class MethodOverloadingWithCalculatorClassForSubtraction {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded subtract methods
        int result1 = calc.subtract(20, 10);
        double result2 = calc.subtract(d15.5, 8.0, 3.5);
        float result3 = calc.subtract(12.5f, 8.5f);
        double result4 = calc.subtract(15, 7.5);

        // Printing results
        System.out.println("Difference of two integers: " + result1);
        System.out.println("Difference of three doubles: " + result2);
        System.out.println("Difference of two floats: " + result3);
        System.out.println("Difference of an integer and a double: " + result4);
    }
}
