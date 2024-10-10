import java.util.Scanner;

 
class Employee {
    int Emp_No;         
    String Emp_Name;    
    String Designation;  

 
    public Employee(int empNo, String empName, String designation) {
        this.Emp_No = empNo;
        this.Emp_Name = empName;
        this.Designation = designation;
    }
}

 
class Salary extends Employee {
    double Basic_Sal;  

     
    public Salary(int empNo, String empName, String designation) {
        super(empNo, empName, designation);  
        setBasicSal();   
    }

     
    public void setBasicSal() {
        switch (Designation.toLowerCase()) {
            case "manager":
                Basic_Sal = 70000;   
                break;
            case "developer":
                Basic_Sal = 50000;   
                break;
            case "tester":
                Basic_Sal = 40000; 
                break;
            default:
                Basic_Sal = 30000;  
                break;
        }
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee No: " + Emp_No);
        System.out.println("Employee Name: " + Emp_Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Basic Salary: " + Basic_Sal);
    }
}

 
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

         
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine();   
        String empName = scanner.nextLine();

        System.out.print("Enter Designation (Manager/Developer/Tester): ");
        String designation = scanner.nextLine();

        
        Salary employeeSalary = new Salary(empNo, empName, designation);
 
        employeeSalary.displayEmployeeDetails();

    
    }
}
