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
Constraints
The empId should be a positive integer.
The phone number should be exactly 10 digits long.
The salary should be a positive number.
 */

package in.java;
import java.util.Scanner;
public class EncapsulatinEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		 int empId = scanner.nextInt();
		 scanner.nextLine();
		 String empName = scanner.nextLine();
		 String designation = scanner.nextLine();
		 String email= scanner.nextLine();
		 long phone = scanner.nextLong();
		 double salary = scanner.nextDouble();
		 
		// call the setters for set the data 
		 employee.setEmpId(empId);
		 employee.setEmpName(empName);
		 employee.setDesignation(designation);
		 employee.setEmail(email);
		 employee.setPhone(phone);
		 employee.setSalary(salary);
		 
		 // get the data using getters
		 System.out.println( employee.getEmpId());
		 System.out.println( employee.getEmpName());
		 System.out.println(employee.getDesignation());
		 System.out.println(employee.getEmail());
		 System.out.println(employee.getPhone());
		 System.out.println(employee.getSalary());
	}
	

}

class Employee{
	// create private variables
	private int empId;
	private String empName;
	private String designation;
	private String email;
	private long phone;
	private double salary;
	
	
	// create constructors 
	public Employee() {
		
	}
	public Employee(int empId,String empName, String designation,String email, long phone, double salary ) {
		this.empId = empId;
		this.empName = empName;
		this.designation= designation;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	// setter and getters for empId
	 public void setEmpId(int empId) {
		 this.empId = empId;
	 }
	 public int getEmpId() {
		 return empId;
	 }
	 //setter and getters for empName
	 public void setEmpName(String empName) {
		 this.empName = empName;
	 }
	 public String getEmpName() {
		 return empName;
	 }
	 //setter and getters for designation
	 public void setDesignation(String designation) {
		 this.designation = designation;
	 }
	 public String getDesignation() {
		 return designation;
	 }
	//setter and getters for email
	 public void setEmail(String email) {
		this.email = email;
	 }
	 public String getEmail() {
			 return email;
	 }
	 //setter and getters for designation
	 public void setPhone(long phone) {
			 this.phone = phone;
	 }
	 public long getPhone() {
			 return phone;
	 }	 
	//setter and getters for designation
	 public void setSalary(double salary) {
				 this.salary = salary;
	  }
	  public double getSalary() {
				 return salary;
	  }	 		 
	 
	
}