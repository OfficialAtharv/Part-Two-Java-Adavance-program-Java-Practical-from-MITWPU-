// Define the interface CalculateResult
interface CalculateResult {
    void calculateTotal();      // Method to calculate total marks
    void calculatePercentage(); // Method to calculate percentage
    void calculateGrade();      // Method to calculate grade
}

// Class Student implementing CalculateResult interface
class Student implements CalculateResult {
    String name;
    int rollNo;
    int[] marks; // Array to store marks of different subjects
    int totalMarks;
    float percentage;
    String grade;

    // Constructor to initialize student details
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.totalMarks = 0;
        this.percentage = 0.0f;
        this.grade = "";
    }

    // Implement calculateTotal() method
    public void calculateTotal() {
        for (int mark : marks) {
            totalMarks += mark; // Calculate total marks
        }
        System.out.println("Total Marks: " + totalMarks);
    }

    // Implement calculatePercentage() method
    public void calculatePercentage() {
        int numSubjects = marks.length;
        percentage = (totalMarks / (float)(numSubjects * 100)) * 100; // Assuming each subject has a maximum of 100 marks
        System.out.println("Percentage: " + percentage + "%");
    }

    // Implement calculateGrade() method
    public void calculateGrade() {
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class Q22 {
    public static void main(String[] args) {
        // Sample student data
        int[] marks = {85, 90, 88}; // Marks in 3 subjects

        // Create a Student object
        Student student = new Student("John Doe", 101, marks);

        // Display student information and results
        System.out.println("Student Name: " + student.name);
        System.out.println("Roll No: " + student.rollNo);

        // Calculate and display total marks, percentage, and grade
        student.calculateTotal();
        student.calculatePercentage();
        student.calculateGrade();
    }
}
