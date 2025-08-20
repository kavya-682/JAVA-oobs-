/*
 Create a class Student with private attributes id, name, age, and grade.
 Implement getter and setter methods for these fields to allow reading and updating of the values.
 Write a program that reads data for a student, updates it using the setter methods, and prints the student's information using the getter methods.

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
sample input>>
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

public class StudentRecordManagementEncapsulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        
         int id = scanner.nextInt();
         scanner.nextLine();
    	 String name = scanner.nextLine();
    	 int age = scanner.nextInt();
    	 scanner.nextLine();
    	 String grade = scanner.nextLine();

    	 //setting the data using setter methods
    	 student.setId(id);
    	 student.setName(name);
    	 student.setAge(age);
    	 student.setGrade(grade);

    	// getting int data using geeter methods
    	 System.out.println(student.getId());
    	 System.out.println(student.getName());
    	 System.out.println(student.getAge());
    	 System.out.println(student.getGrade());
    	 
	}
}
class Student{
	private int id;
	private String name;
	private int age;
	private String grade;
	
	//Setter and getter for id 
	public void setId(int id) {
		this.id = id;
	}
	public int getId(){
		return id;
	}
	//Setter and getter for name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//Setter and getter for age 
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	//Setter and getter for grade
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
}

