import java.util.Scanner;

class Bank {
    String cust_name;
    String ac_no; 
    float balance; 

   
    public Bank(String cust_name, String ac_no, float balance) {
        this.cust_name = cust_name;
        this.ac_no = ac_no;
        this.balance = balance;
    }

    
    public void withdraw(int withdraw_amt) {
        if (withdraw_amt <= balance) {
            balance -= withdraw_amt;
            System.out.println("Withdraw successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    public void deposit(int deposit_amt) {
        balance += deposit_amt;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter customer name: ");
        String cust_name = sc.nextLine();

        System.out.print("Enter account number: ");
        String ac_no = sc.nextLine();

        System.out.print("Enter initial balance: ");
        float balance = sc.nextFloat();

       
        Bank account = new Bank(cust_name, ac_no, balance);

       
        System.out.print("Withdraw amount: ");
        int withdraw_amt = sc.nextInt();
        account.withdraw(withdraw_amt);

        System.out.print("Deposit amount: ");
        int deposit_amt = sc.nextInt();
        account.deposit(deposit_amt);
    }
}
