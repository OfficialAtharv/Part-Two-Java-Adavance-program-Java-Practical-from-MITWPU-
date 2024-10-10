import java.util.Scanner;

// Abstract class Person
abstract class Person {
    protected String name;
    protected String address;

    // Abstract methods to accept and display details
    public abstract void acceptDetails();
    public abstract void displayDetails();
}

// Derived class Employee
class Employee extends Person {
    private int employeeNumber;

    // Accept details for Employee
    @Override
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number: ");
        employeeNumber = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee Address: ");
        address = sc.nextLine();
    }

    // Display details for Employee
    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
    }
}

// Derived class Worker
class Worker extends Person {
    private int workerNumber;

    // Accept details for Worker
    @Override
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Worker Number: ");
        workerNumber = sc.nextInt();
        sc.nextLine();  
        System.out.println("Enter Worker Name: ");
        name = sc.nextLine();
        System.out.println("Enter Worker Address: ");
        address = sc.nextLine();
    }

     
    
    public void displayDetails() {
        System.out.println("Worker Details:");
        System.out.println("Worker Number: " + workerNumber);
        System.out.println("Worker Name: " + name);
        System.out.println("Worker Address: " + address);
    }
}

 
public class Q12 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Worker worker = new Worker();

        System.out.println("Enter Employee Details:");
        employee.acceptDetails();

        System.out.println("\nEnter Worker Details:");
        worker.acceptDetails();

        System.out.println("\nDisplaying Employee Details:");
        employee.displayDetails();

        System.out.println("\nDisplaying Worker Details:");
        worker.displayDetails();
    }
}
