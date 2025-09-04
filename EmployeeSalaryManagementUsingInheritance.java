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
Constraints
1. The `salary` and `bonus` values are positive integers.

2. The `overtime` value is a positive integer.

3. The `name` is a string with a maximum length of 50 characters.

4. The `salary`, `bonus`, and `overtime` values must be between 1 and 1,000,000 inclusive.

5. Input values must be provided in the correct format, otherwise, the program should handle errors gracefully.

6. There must be no leading or trailing spaces in the comma-separated input values.
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

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
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

    public int getBonus() {
        return bonus;
    }

    @Override
    public double getAnnualSalary() {
        return getSalary() * 12.0 + bonus;
    }
}

class Engineer extends Employee {
    private int overtime;

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    @Override
    public double getAnnualSalary() {
        return getSalary() * 12.0 + overtime;
    }
}

public class EmployeeSalaryManagementUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeType = scanner.nextLine().trim();
        String inputLine = scanner.nextLine().trim();

        String[] parts = inputLine.split(",");

        if (employeeType.equals("Manager")) {
            if (parts.length == 3) {
                String name = parts[0];
                String salaryStr = parts[1];
                String bonusStr = parts[2];

                if (isValidName(name) && isValidNumber(salaryStr) && isValidNumber(bonusStr)) {
                    int salary = Integer.parseInt(salaryStr);
                    int bonus = Integer.parseInt(bonusStr);

                    if (isInRange(salary) && isInRange(bonus)) {
                        Manager manager = new Manager();
                        manager.setName(name);
                        manager.setSalary(salary);
                        manager.setBonus(bonus);

                        System.out.printf("Annual Salary of Manager: %.2f\n", manager.getAnnualSalary());
                    } else {
                        System.out.println("Salary or bonus out of range.");
                    }
                } else {
                    System.out.println("Invalid input values.");
                }
            } else {
                System.out.println("Invalid input format for Manager.");
            }

        } else if (employeeType.equals("Engineer")) {
            if (parts.length == 3) {
                String name = parts[0];
                String salaryStr = parts[1];
                String overtimeStr = parts[2];

                if (isValidName(name) && isValidNumber(salaryStr) && isValidNumber(overtimeStr)) {
                    int salary = Integer.parseInt(salaryStr);
                    int overtime = Integer.parseInt(overtimeStr);

                    if (isInRange(salary) && isInRange(overtime)) {
                        Engineer engineer = new Engineer();
                        engineer.setName(name);
                        engineer.setSalary(salary);
                        engineer.setOvertime(overtime);

                        System.out.printf("Annual Salary of Engineer: %.2f\n", engineer.getAnnualSalary());
                    } else {
                        System.out.println("Salary or overtime out of range.");
                    }
                } else {
                    System.out.println("Invalid input values.");
                }
            } else {
                System.out.println("Invalid input format for Engineer.");
            }

        } else {
            System.out.println("Invalid employee type.");
        }

        scanner.close();
    }

    // Helper methods for validation
    public static boolean isValidNumber(String value) {
        // Check if the string is all digits
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return value.length() > 0;
    }

    public static boolean isInRange(int value) {
        return value >= 1 && value <= 1000000;
    }

    public static boolean isValidName(String name) {
        return name != null && name.length() <= 50;
    }
}
