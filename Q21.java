import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize a counter for lines containing the pattern
        int patternCount = 0;

        System.out.println("Enter lines of text (type 'good bye' to stop):");

        // Infinite loop to accept lines of input until "good bye" is entered
        while (true) {
            // Read a line of input from the user
            String line = sc.nextLine();

            // Break the loop if "good bye" is entered
            if (line.equalsIgnoreCase("good bye")) {
                break;
            }

            // Check if the line contains the word "India" or "Hello"
            if (line.contains("India") || line.contains("Hello")) {
                // Display the line containing the pattern
                System.out.println(line);
                // Increment the counter for the number of matching lines
                patternCount++;
            }
        }

        // Display the count of lines containing the pattern
        System.out.println("\nNumber of lines containing 'India' or 'Hello': " + patternCount);

        // Close the scanner
        sc.close();
    }
}
