/*
Problem
Create a class Employee with private attributes empId, empName, designation, email, phone, and salary. Use getter and setter methods to access and modify these attributes, following the principles of encapsulation.

Your task is to take input from the user for each attribute and display the employee's information using the getter methods. Ensure that all private data is accessed and modified only through public methods.

Input Format
The input consists of six lines:
An integer representing the empId.
A string representing the empName.
A string representing the designation.
A string representing the email.
A long integer representing the phone.
A double representing the salary.
Output Format
Display the employee's information in the following order:
empId
empName
designation
email
phone
salary
Do's
Create the class: Define a class named Employee.
Declare private attributes: Inside the class, declare private attributes: empId, empName, designation, email, phone, and salary.
Implement getter methods: Create public getter methods to return the values of the private attributes.
Implement setter methods: Create public setter methods to allow assigning values to the private attributes.
Follow the input structure: Ensure that input is taken in the correct order: first empId, then empName, designation, email, phone, and finally salary.
Set the values using setter methods: Use the setter methods to assign values to the private variables.
Use getter methods to display output: Display the employee's information by calling the getter methods, in the order specified in the output format.
Ensure encapsulation: Use only public methods (getter and setter) to interact with the private variables, ensuring encapsulation.
Sample Inputs & Outputs
Sample Input 1

101
John Doe
Software Engineer
john.doe@example.com
9876543210
75000.50
Sample Output 1

101
John Doe
Software Engineer
john.doe@example.com
9876543210
75000.5
*/
import java.util.Scanner;

class Employee {
    // Private attributes (Encapsulation)
    private int empId;
    private String empName;
    private String designation;
    private String email;
    private long phone;
    private double salary;

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeInfoWithEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        // Taking input from user and setting values using setters
        emp.setEmpId(sc.nextInt());
        sc.nextLine(); // consume newline
        emp.setEmpName(sc.nextLine());
        emp.setDesignation(sc.nextLine());
        emp.setEmail(sc.nextLine());
        emp.setPhone(sc.nextLong());
        emp.setSalary(sc.nextDouble());

        // Displaying employee details using getters
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getDesignation());
        System.out.println(emp.getEmail());
        System.out.println(emp.getPhone());
        System.out.println(emp.getSalary());

        sc.close();
    }
}
