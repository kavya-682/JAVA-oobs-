/*

Problem
Create a class `Course` with private attributes `courseName` and `courseCode`. It should have methods to set and get these attributes. Additionally, it should have a method `getDetails()` which returns a string with course details.



Derive a class `OnlineCourse` from `Course`, adding an attribute `platform`. It should override the `getDetails()` method to include the platform in the course details.



Derive another class named `OfflineCourse` from `Course`, adding an attribute `location`. It should override the `getDetails()` method to include the location in the course details.



Write a program that asks the user which type of course needs to be created. According to the user's choice, collect the details from the user and display the details of the respective course.

Input Format
The first line contains the type of course ("OnlineCourse" or "OfflineCourse").

The second line contains a comma-separated list of the attributes for the course.

For an OnlineCourse: courseName,courseCode,platform
For an OfflineCourse: courseName,courseCode,location
Output Format
A single line displaying the details of the course in the format:

Course Details: Course Name: <CourseName>, Course Code: <CourseCode>, Platform: <Platform> for OnlineCourse
Course Details: Course Name: <CourseName>, Course Code: <CourseCode>, Location: <Location> for OfflineCourse
Do's
Create a base class named Course.
Use private variables in the Course class named courseName and courseCode.
Create a subclass named OnlineCourse using inheritance.
Use a private variable in the OnlineCourse class named platform.
Create a subclass named OfflineCourse using inheritance.
Use a private variable in the OfflineCourse class named location.
Override the getDetails() method in OnlineCourse and OfflineCourse.
Create appropriate public getters and setters for variables in Course, OnlineCourse, and OfflineCourse.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

OnlineCourse
Python Programming,CS101,TAI
Sample Output 1

Course Details: Course Name: Python Programming, Course Code: CS101, Platform: TAI
Sample Input 2

OfflineCourse
Data Structures,CS102,BTM 301
Sample Output 2

Course Details: Course Name: Data Structures, Course Code: CS102, Location: BTM 301

*/

import java.util.Scanner;

class Course {
    private String courseName;
    private String courseCode;

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // Method to return course details
    public String getDetails() {
        return "Course Details: Course Name: " + courseName + ", Course Code: " + courseCode;
    }
}

class OnlineCourse extends Course {
    private String platform;

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String getDetails() {
        return "Course Details: Course Name: " + getCourseName() +
               ", Course Code: " + getCourseCode() +
               ", Platform: " + platform;
    }
}

class OfflineCourse extends Course {
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getDetails() {
        return "Course Details: Course Name: " + getCourseName() +
               ", Course Code: " + getCourseCode() +
               ", Location: " + location;
    }
}

public class CourseInfoUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String courseType = sc.nextLine().trim();
        String[] inputs = sc.nextLine().split(",");

        if (courseType.equals("OnlineCourse")) {
            OnlineCourse online = new OnlineCourse();
            online.setCourseName(inputs[0].trim());
            online.setCourseCode(inputs[1].trim());
            online.setPlatform(inputs[2].trim());
            System.out.println(online.getDetails());
        } else if (courseType.equals("OfflineCourse")) {
            OfflineCourse offline = new OfflineCourse();
            offline.setCourseName(inputs[0].trim());
            offline.setCourseCode(inputs[1].trim());
            offline.setLocation(inputs[2].trim());
            System.out.println(offline.getDetails());
        }

        sc.close();
    }
}
