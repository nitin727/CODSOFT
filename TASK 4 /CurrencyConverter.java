import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");

        System.out.println("Select Base Currency:");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. USD (US Dollar)");

        int base = sc.nextInt();

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        double result = 0;

        if (base == 1) {
            System.out.println("Convert INR to:");
            System.out.println("1. USD");
            System.out.println("2. EUR");

            int target = sc.nextInt();

            if (target == 1) {
                result = amount * 0.012;
                System.out.println(amount + " INR = " + result + " USD");
            }
            else if (target == 2) {
                result = amount * 0.011;
                System.out.println(amount + " INR = " + result + " EUR");
            }
            else {
                System.out.println("Invalid choice");
            }
        }

        else if (base == 2) {
            System.out.println("Convert USD to:");
            System.out.println("1. INR");
            System.out.println("2. EUR");

            int target = sc.nextInt();

            if (target == 1) {
                result = amount * 83;
                System.out.println(amount + " USD = " + result + " INR");
            }
            else if (target == 2) {
                result = amount * 0.92;
                System.out.println(amount + " USD = " + result + " EUR");
            }
            else {
                System.out.println("Invalid choice");
            }
        }

        else {
            System.out.println("Invalid base currency");
        }

        sc.close();
    }
}
