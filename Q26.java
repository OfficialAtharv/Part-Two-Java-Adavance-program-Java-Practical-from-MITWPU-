// Abstract Class: Staff
abstract class Staff {
    int no;
    String name;

    // Instance method to input staff data
    public void LintData(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // Abstract method for salary calculation
    public abstract int calculateSalary();
}

// Subclass: Typist
class Typist extends Staff {
    int speed;

    // Constructor to initialize speed
    public Typist(int speed) {
        this.speed = speed;
    }

    // Overriding calculateSalary method
    @Override
    public int calculateSalary() {
        if (speed < 40) {
            return 4000;
        } else {
            return 5000;
        }
    }
}

// Main Class to test implementation
public class Q26 {
    public static void main(String[] args) {
        // Creating a Typist object
        Typist typist = new Typist(45); // Assuming speed is 45
        
        // Setting typist's staff data
        typist.LintData(101, "John Doe");
        
        // Displaying typist details and calculated salary
        System.out.println("Staff No: " + typist.no);
        System.out.println("Staff Name: " + typist.name);
        System.out.println("Speed: " + typist.speed);
        System.out.println("Calculated Salary: " + typist.calculateSalary());
    }
}
