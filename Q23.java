// Base class Employee
class Employee {
    String name;
    int employeeId;

    // Constructor to initialize Employee details
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Method to calculate salary (will be overridden by subclasses)
    public void calcsal() {
        System.out.println("Salary calculation is done in subclasses.");
    }
}

// TemporaryEmployee class extending Employee
class TemporaryEmployee extends Employee {
    int hoursWorkedPerMonth;
    int overtimeHours;
    int hourlyRate;

    // Constructor to initialize TemporaryEmployee details
    public TemporaryEmployee(String name, int employeeId, int hoursWorkedPerMonth, int overtimeHours, int hourlyRate) {
        super(name, employeeId);  // Calling the base class constructor
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    // Overriding calcsal() to calculate salary based on hours worked and overtime
    @Override
    public void calcsal() {
        int totalSalary = (hoursWorkedPerMonth * hourlyRate) + (overtimeHours * hourlyRate * 2);  // Assuming overtime is paid double
        System.out.println("Temporary Employee Salary for " + name + ": $" + totalSalary);
    }
}

// PermanentEmployee class extending Employee
class PermanentEmployee extends Employee {
    int daysWorkedPerMonth;
    int dailyRate;

    // Constructor to initialize PermanentEmployee details
    public PermanentEmployee(String name, int employeeId, int daysWorkedPerMonth, int dailyRate) {
        super(name, employeeId);  // Calling the base class constructor
        this.daysWorkedPerMonth = daysWorkedPerMonth;
        this.dailyRate = dailyRate;
    }

    // Overriding calcsal() to calculate salary based on days worked
    @Override
    public void calcsal() {
        int totalSalary = daysWorkedPerMonth * dailyRate;
        System.out.println("Permanent Employee Salary for " + name + ": $" + totalSalary);
    }
}

// Main class to test the implementation
public class Q23 {
    public static void main(String[] args) {
        // Creating a TemporaryEmployee object
        TemporaryEmployee tempEmp = new TemporaryEmployee("John Doe", 101, 160, 20, 20);  // 160 hours, 20 overtime hours, $20 per hour
        tempEmp.calcsal();  // Calculate and display the salary for temporary employee

        // Creating a PermanentEmployee object
        PermanentEmployee permEmp = new PermanentEmployee("Jane Smith", 102, 22, 100);  // 22 days, $100 per day
        permEmp.calcsal();  // Calculate and display the salary for permanent employee
    }
}
