/*
Problem   
Create a class Person with private attributes name and age. It should have methods to set and get these attributes. Additionally, it should have a method getDetails() which returns a string with person details.

Derive a class Employee from Person, adding an attribute employeeID. It should override the getDetails() method to include the employee ID in the person details.

Derive another class named Manager from Employee, adding an attribute department. It should override the getDetails() method to include the department in the employee details.

Write a program that asks the user to create a Manager object, collects the details from the user, and displays the manager details.

Input Format
The first line contains the manager details in the format: name,age,employeeID,department.

Output Format
A single line displaying the manager details in the format:

Manager Details: Name: <Name>, Age: <Age>, Employee ID: <EmployeeID>, Department: <Department>.

Do's
Create a base class named Person.
Use private variables in the Person class named name and age.
Create a subclass named Employee using inheritance.
Use a private variable in the Employee class named employeeID.
Create a subclass named Manager using inheritance.
Use a private variable in the Manager class named department.
Override the getDetails() method in Employee and Manager.
Create appropriate public getters and setters for variables in Person, Employee, and Manager.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Don't Use Improper Naming Conventions: Avoid using unclear or non-descriptive names for variables and methods.
Sample Inputs & Outputs
Sample Input 1

John,45,E123,Sales
Sample Output 1

Manager Details: Name: John, Age: 45, Employee ID: E123, Department: Sales
Sample Input 2

Alice,38,E456,Marketing
Sample Output 2

Manager Details: Name: Alice, Age: 38, Employee ID: E456, Department: Marketing
Constraints
1. The `name` is a string with a maximum length of 50 characters.

2. The `age` is a positive integer.

3. The `employeeID` is a string with a maximum length of 20 characters.

4. The `department` is a string with a maximum length of 50 characters.

5. Input values must be provided in the correct format, otherwise, the program should handle errors gracefully.

6. There must be no leading or trailing spaces in the comma-separated input values.
*/
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() <= 50) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Employee extends Person {
    private String employeeID;

    // Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (employeeID != null && employeeID.length() <= 20) {
            this.employeeID = employeeID;
        } else {
            throw new IllegalArgumentException("Invalid Employee ID");
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Employee ID: " + employeeID;
    }
}

class Manager extends Employee {
    private String department;

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && department.length() <= 50) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Invalid Department");
        }
    }

    @Override
    public String getDetails() {
        return "Manager Details: " + super.getDetails() + ", Department: " + department;
    }
}

public class PersonInfoUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (parts.length != 4) {
                throw new IllegalArgumentException("Input format is incorrect.");
            }

            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String employeeID = parts[2];
            String department = parts[3];

            Manager manager = new Manager();
            manager.setName(name);
            manager.setAge(age);
            manager.setEmployeeID(employeeID);
            manager.setDepartment(department);

            System.out.println(manager.getDetails());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
