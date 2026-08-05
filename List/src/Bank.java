package List.src;


import java.time.temporal.TemporalAmount;
import java.util.Scanner;

public class Bank {

        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        double balance = 0;
        double amount = 0;

        do {
            showMainMenu();

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = balance + deposit();

                    break;

                case 3:
                    balance = balance - withdraw(balance);
                    break;
                case 4:
                System.out.println("Exiting program.");
                    break;
                default:
                System.out.println("Invalid choice.");

            }
        } while (option !=4);



    }

    public static void showMainMenu(){
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");
        System.out.println("Enter your choice (1-4)");
    }

    public static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("Balance: $%.2f\n", balance);
    }

    static double deposit(){
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance){
        double amount;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("There's not enough funds to be withdrawn. Try again");
            return 0;
        } else if (amount <= 0) {
            System.out.println("Invalid number.");
            return 0;
        } else {
            return amount;
        }
    }

}
