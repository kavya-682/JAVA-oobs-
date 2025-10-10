/*
Problem
Create a class Employee with private attributes empId, name, department, and salary. Implement getter and setter methods for each attribute to ensure encapsulation. Write a program that allows the user to input details for an Employee object and then prints out the employee's information using the getter methods.

Input Format
The input consists of four lines:
An integer representing the empId.
A string representing the name.
A string representing the department.
A float representing the salary.
Output Format
The output should display the employee's information in the following order:
empId
name
department
salary
Do's
Create the class: Define a class named Employee.
Declare private attributes: Inside the class, declare private attributes: empId, name, department, and salary.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for empId, name, department, and salary from user input.
Display output using getter methods: Use the getter methods to display the employee's information in the specified order.
Sample Inputs & Outputs
Sample Input 1

101
John Doe
IT
75000.00
Sample Output 1

101
John Doe
IT
75000.0
*/

import java.util.Scanner;

class Employee {
    // Private attributes
    private int empId;
    private String name;
    private String department;
    private float salary;

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }
}

public class EmployeeDetailsManagementUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Employee object
        Employee emp = new Employee();

        // Take user input
        int empId = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        String department = sc.nextLine();
        float salary = sc.nextFloat();

        // Set values using setter methods
        emp.setEmpId(empId);
        emp.setName(name);
        emp.setDepartment(department);
        emp.setSalary(salary);

        // Display values using getter methods
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getDepartment());
        System.out.println(emp.getSalary());
    }
}
