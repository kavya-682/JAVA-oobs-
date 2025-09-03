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

class Employee {
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public double getAnnualSalary() {
        return salary * 12.0;
    }
}

class Manager extends Employee {
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }
}

class Engineer extends Employee {
    private int overtime;

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + overtime;
    }
}

public class VihicleInformationUsingInheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        String[] data = scan.nextLine().split(",");

        if (type.equals("Manager")) {
            Manager m = new Manager();
            m.setName(data[0]);
            m.setSalary(Integer.parseInt(data[1]));
            m.setBonus(Integer.parseInt(data[2]));
            System.out.printf("Annual Salary of Manager: %.2f\n", m.getAnnualSalary());
        } else if (type.equals("Engineer")) {
            Engineer e = new Engineer();
            e.setName(data[0]);
            e.setSalary(Integer.parseInt(data[1]));
            e.setOvertime(Integer.parseInt(data[2]));
            System.out.printf("Annual Salary of Engineer: %.2f\n", e.getAnnualSalary());
        }

        scan.close();
    }
}
