// Package Declaration
package student;

import java.util.Scanner;

// Class to store and display student information
class StudentInfo {
    int rollNo;
    String name;
    String studentClass;
    float percentage;

    // Method to display student details
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Class to calculate percentage of the student
class StudentPer {
    // Method to calculate percentage
    public float calculatePercentage(int marks1, int marks2, int marks3) {
        int totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 3.0f);  // Percentage is total / 3 (since it's 3 subjects)
    }
}

// Main class to execute the program
public class Q19 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Create objects of the classes
        StudentInfo student = new StudentInfo();
        StudentPer studentPer = new StudentPer();

        // Input student details
        System.out.println("Enter Roll No: ");
        student.rollNo = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.println("Enter Name: ");
        student.name = sc.nextLine();

        System.out.println("Enter Class: ");
        student.studentClass = sc.nextLine();

        System.out.println("Enter Marks for Subject 1: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter Marks for Subject 2: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter Marks for Subject 3: ");
        int marks3 = sc.nextInt();

        // Calculate percentage using StudentPer class
        student.percentage = studentPer.calculatePercentage(marks1, marks2, marks3);

        // Display student information
        student.displayInfo();

        // Close the scanner object
        sc.close();
    }
}
