import java.util.Scanner;

class Passenger {
    // Instance variables
    String name;
    int age;
    String contactNo;
    String pickupAddress;
    String droppingAddress;

    // Constructor to initialize Passenger details
    public Passenger(String name, int age, String contactNo, String pickupAddress, String droppingAddress) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
        this.pickupAddress = pickupAddress;
        this.droppingAddress = droppingAddress;
    }

    // Method to display Passenger details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Pickup Address: " + pickupAddress);
        System.out.println("Dropping Address: " + droppingAddress);
        System.out.println("---------------------------------");
    }
}

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 passengers
        Passenger[] passengers = new Passenger[10];

        // Accepting details of 10 passengers
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Passenger " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Contact No: ");
            String contactNo = scanner.nextLine();

            System.out.print("Pickup Address: ");
            String pickupAddress = scanner.nextLine();

            System.out.print("Dropping Address: ");
            String droppingAddress = scanner.nextLine();

            // Creating a Passenger object and storing it in the array
            passengers[i] = new Passenger(name, age, contactNo, pickupAddress, droppingAddress);
            System.out.println();
        }

        // Displaying the accepted details of all passengers
        System.out.println("Details of all passengers:");
        for (int i = 0; i < 10; i++) {
            passengers[i].displayDetails();
        }

        scanner.close();
    }
}
