
import java.util.Scanner;


abstract class Employee {

    public abstract void accept();

    public abstract void display();
}

class Manager extends Employee {

    int mid;
    String mname;
    String pno;

    public void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Manager Id :");
        mid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Manager Name :");
        mname=sc.nextLine();
        System.out.println("Enter the manager Phone number :");
        pno=sc.nextLine();

    }

    public void display() { 
        System.out.println("Manager Id is :"+mid);
        System.out.println("Manager Name is :"+mname);
        System.out.println("Manager phone number is :"+pno);
    }
}

class Worker extends Employee {

    String name;
    int working_hours;

    public void accept() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Worker Name :");
        name=sc.nextLine();
        System.out.println("Enter the Wroking hours");
        working_hours=sc.nextInt();
    }

    public void display() {
        System.out.println("Worker Name is :"+name);
        System.out.println("Worker's Wroking hours :"+working_hours);
    }
}

public class Q17 {

    public static void main(String args[]) {
        Manager manager = new Manager();
        System.out.println("Enter Manager details :- ");
        manager.accept();
        manager.display();
        Worker worker = new Worker(); 
        System.out.println("Enter Worker details :- ");
        worker.accept();
        worker.display();
    }
}
