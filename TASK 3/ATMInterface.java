import java.util.Scanner;

// ATM Class
class ATM {

    private double balance;

    // Constructor
    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    // Check Balance
    public void checkBalance() {
        System.out.println(" Current Balance: ₹" + balance);
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" ₹" + amount + " deposited successfully.");
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(" ₹" + amount + " withdrawn successfully.");
        }
    }
}

// Main Class
public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(10000); // Initial Balance ₹10000

        int choice;

        System.out.println("===== Welcome to ATM =====");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println(" Thank you for using ATM!");
                    break;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
