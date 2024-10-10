import java.util.ArrayList;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        // Create an ArrayList to store city names
        ArrayList<String> cityList = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Accept the number of cities to be added
        System.out.println("Enter the number of cities you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline

        // Input city names from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of city " + (i + 1) + ": ");
            String city = sc.nextLine();
            cityList.add(city);  // Add city to ArrayList
        }

        // Display the cities in the ArrayList
        System.out.println("\nCities in the list:");
        for (String city : cityList) {
            System.out.println(city);
        }

        // Clear all elements from the ArrayList
        cityList.clear();
        System.out.println("\nThe ArrayList has been cleared.");

        // Display the ArrayList after clearing
        System.out.println("Cities in the list after clearing: " + cityList);

        // Close the scanner
        sc.close();
    }
}

