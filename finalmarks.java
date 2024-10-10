import java.util.Scanner;

// Define class Student with attributes roll_no and name
class Student {
    int roll_no;  // Attribute for roll number
    String name;  // Attribute for name
}

// Class Marks inherits from Student
class Marks extends Student {
    int java_theory;      // Attribute for Java Theory marks
    int java_practical;   // Attribute for Java Practical marks
    int total_marks;      // Attribute for total Java marks

    // Method to set the total of Java marks
    public void setMarks() {
        total_marks = java_theory + java_practical;  // Calculate total marks
    }

    // Method to display total marks
    public void displayMarks() {
        System.out.println("Total Java Marks: " + total_marks);
    }
}

// Main class FinalMarks
public class finalmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        // Create a Marks object (inherits from Student)
        Marks studentMarks = new Marks();

        // Take input from the user for roll number and name
        System.out.print("Enter roll number: ");
        studentMarks.roll_no = sc.nextInt();  // Input roll number

        System.out.print("Enter name: ");
        sc.nextLine();  // Consume newline left by nextInt()
        studentMarks.name = sc.nextLine();  // Input student name

        // Take input for Java Theory and Java Practical marks
        System.out.print("Enter Java Theory marks: ");
        studentMarks.java_theory = sc.nextInt();

        System.out.print("Enter Java Practical marks: ");
        studentMarks.java_practical = sc.nextInt();

        // Calculate and display total marks
        studentMarks.setMarks();  // Set total marks in setMarks()
        studentMarks.displayMarks();  // Display the total marks
    }
}
