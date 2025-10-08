/*
Problem
Create a class Student with private attributes id, name, age, and grade. Implement getter and setter methods for these fields to allow reading and updating of the values. Write a program that reads data for a student, updates it using the setter methods, and prints the student's information using the getter methods.

Input Format
The input consists of four lines:
An integer representing the id.
A string representing the name.
An integer representing the age.
A string representing the grade.
Output Format
The output should display the student's information in the following order:
id
name
age
grade
Do's
Create the class: Define a class named Student.
Declare private attributes: Inside the class, declare private attributes: id, name, age, and grade.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Follow input order: Ensure the input is taken in the following order: id, name, age, grade.
Use setter methods: Use setter methods to update the student's information.
Display output using getter methods: Use getter methods to display the student's information.
Sample Inputs & Outputs
Sample Input 1

123
Alice Smith
20
A
Sample Output 1

123
Alice Smith
20
A

*/

import java.util.Scanner;

class Student {
    // Private attributes
    private int id;
    private String name;
    private int age;
    private String grade;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}

public class StudentInfoWithEncapsulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Student object
        Student student = new Student();

        // Take input using setters
        student.setId(sc.nextInt());
        sc.nextLine(); // Consume newline after integer input
        student.setName(sc.nextLine());
        student.setAge(sc.nextInt());
        sc.nextLine(); // Consume newline after integer input
        student.setGrade(sc.nextLine());

        // Display student details using getters
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGrade());

        sc.close();
    }
}
