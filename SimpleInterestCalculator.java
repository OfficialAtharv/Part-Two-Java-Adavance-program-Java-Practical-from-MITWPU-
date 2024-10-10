import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for principal, period (time), and interest rate
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the period of deposit (in years): ");
        double period = scanner.nextDouble();

        double rate = 0;

        // Determine the interest rate based on the principal and period
        if (principal <= 10000) {
            if (period <= 2) {
                rate = 9;  // 9% interest rate for period <= 2 years
            } else {
                rate = 10; // 10% interest rate for period > 2 years
            }
        } else {
            rate = 11;     // 11% interest rate for principal > 10000
        }

        // Calculate simple interest
        double simpleInterest = (principal * rate * period) / 100;

        // Display the results
        System.out.println("Principal: " + principal);
        System.out.println("Period of Deposit: " + period + " years");
        System.out.println("Interest Rate: " + rate + " %");
        System.out.println("Simple Interest to be paid: " + simpleInterest);

       
    }
}
