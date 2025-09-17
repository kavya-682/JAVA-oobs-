/*
Problem
Create a class `Employee` with private attributes `name` and `salary`. It should have methods to set and get these attributes. Additionally, it should have a method `getAnnualSalary()` which returns the annual salary.



Derive a class `Manager` from `Employee`, adding an attribute `bonus`. It should override the `getAnnualSalary()` method to return the annual salary including the bonus.



Derive another class named `Engineer` from `Employee`, adding an attribute `overtime`. It should override the `getAnnualSalary()` method to return the annual salary including the payment for overtime.



Write a program that asks the user which type of employee needs to be created. According to the user's choice, collect the details from the user and display the annual salary of the respective employee.

Input Format
- The first line contains the type of employee ("Manager" or "Engineer").

- The second line contains a comma-separated list of the attributes for the employee.

  - For a Manager: name,salary,bonus

  - For an Engineer: name,salary,overtime

Output Format
- A single line displaying the annual salary of the employee in the format: `Annual Salary of <EmployeeType>: <AnnualSalary>`

- There are 2 decimal places in the annual salary.

Do's
Create a Base class named Employee.
Use private variables in the Employee class named as name, salary.
Create a subclass named Manager using inheritance.
Use private variable in the Manager class named as bonus.
Create a subclass named Engineer using inheritance.
Use private variable in Engineer class named as overtime.
Override getAnnualSalary method in Manager & Engineer.
Create appropriate public getters and setters for variables in Employee, Manager, and Engineer class.
Follow camel case convention for variable names, method names.
Follow pascal case convention for class names.
Use proper Naming Conventions:Avoid using unclear or non-descriptive names for variables and methods.
Sample Inputs & Outputs
Sample Input 1

Manager
Alice,60000,10000
Sample Output 1

Annual Salary of Manager: 730000.00
Sample Input 2

Engineer
Bob,50000,5000
Sample Output 2

Annual Salary of Engineer: 605000.00
*/
import java.util.Scanner;

// Base Class
class Employee {
    private String name;
    private double salary;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }
}

// Subclass Manager
class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnualSalary() {
        return (getSalary() * 12) + bonus;
    }
}

// Subclass Engineer
class Engineer extends Employee {
    private double overtime;

    public double getOvertime() {
        return overtime;
    }
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public double getAnnualSalary() {
        return (getSalary() * 12) + overtime;
    }
}

// Main Class
public class EmployeeSalaryInfoUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        String empType = sc.nextLine().trim();
        String[] details = sc.nextLine().trim().split(",");

        if (empType.equalsIgnoreCase("Manager")) {
            Manager manager = new Manager();
            manager.setName(details[0]);
            manager.setSalary(Double.parseDouble(details[1]));
            manager.setBonus(Double.parseDouble(details[2]));

            System.out.printf("Annual Salary of Manager: %.2f", manager.getAnnualSalary());

        } else if (empType.equalsIgnoreCase("Engineer")) {
            Engineer engineer = new Engineer();
            engineer.setName(details[0]);
            engineer.setSalary(Double.parseDouble(details[1]));
            engineer.setOvertime(Double.parseDouble(details[2]));

            System.out.printf("Annual Salary of Engineer: %.2f", engineer.getAnnualSalary());
        }

        sc.close();
    }
}
