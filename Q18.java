
import java.util.Scanner;

abstract class order {

    int id;
    String members;
    String description;

    public abstract void Accept();

    public abstract void Display();
}

class PurchaseOrder extends order {

    String CoustomerName;
    String VendorName;

    public void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase order Id :- ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter description");
        description = sc.nextLine();
        System.out.println("Enter Coustormer name :-  ");
        CoustomerName = sc.nextLine();
        System.out.println("Enter Vendor Name :- ");
        VendorName = sc.nextLine();
    }

    public void Display() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Purchasing Coustomer name is : " + CoustomerName);
        System.out.println("Vendor Name is : " + VendorName);
    }
}

class SalesOrder extends order {

    String CoustomerName;
    String VendorName;

    public void Accept() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Sales order Id :- ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter description");
        description = sc.nextLine();
        System.out.println("Enter Coustormer name :-  ");
        CoustomerName = sc.nextLine();
        System.out.println("Enter Vendor Name :- ");
        VendorName = sc.nextLine();
    }

    public void Display() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Sales Coustomer name is : " + CoustomerName);
        System.out.println("Vendor Name is : " + VendorName);
    }
}

public class Q18 {
    public static void main(String[] args) {
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[5];
        SalesOrder[] salesOrders = new SalesOrder[5];

     
        System.out.println("Enter details for Purchase Orders:");
        for (int i = 0; i < 5; i++) {
            purchaseOrders[i] = new PurchaseOrder();
            purchaseOrders[i].Accept();
        }

        System.out.println("\nEnter details for Sales Orders:");
        for (int i = 0; i < 5; i++) {
            salesOrders[i] = new SalesOrder();
            salesOrders[i].Accept();
        }

        
        System.out.println("\nDisplaying Purchase Orders:");
        for (int i = 0; i < 5; i++) {
            purchaseOrders[i].Display();
        }

        System.out.println("\nDisplaying Sales Orders:");
        for (int i = 0; i < 5; i++) {
            salesOrders[i].Display();
        }
    }
}