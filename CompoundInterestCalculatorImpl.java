import java.util.Scanner;

// Define the interface with a method to calculate compound interest
 interface CompoundInterestCalculator {
    double calculateCompoundInterest(double amount, int years, double rate);
}

// Implement the interface in a class
 class CompoundInterestCalculatorImpl implements CompoundInterestCalculator {

    // Implement the method to calculate compound interest
    @Override
    public double calculateCompoundInterest(double amount, int years, double rate) {
        // Formula for compound interest: A = P(1 + r/100)^t
        
        double compoundInterest = amount * Math.pow((1 + rate / 100), years);
        return compoundInterest;
    }

    // Main method to test the implementation with user input
    public static void main (String[] args) {
        // Create an instance of the implementing class
        CompoundInterestCalculator calculator = new CompoundInterestCalculatorImpl();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the principal amount, number of years, and rate of interest
        System.out.print("Enter the principal amount: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        
        // Calculate the compound interest based on user input
        double result = calculator.calculateCompoundInterest(amount, years, rate);
        
        // Print the result
        System.out.println("Compound Interest after " + years + " years: " + result);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
