package objectoriented.inheritance.hierarchicalinheritance;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Bank Account Types Demo ---\n");

        BankAccount[] accounts = new BankAccount[3];

        System.out.println("Enter Savings Account details:");
        System.out.print("Account Number: ");
        String savAccNo = scanner.nextLine();
        System.out.print("Holder Name: ");
        String savHolder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double savBalance = scanner.nextDouble();
        System.out.print("Interest Rate (%): ");
        double interestRate = scanner.nextDouble();
        scanner.nextLine();
        accounts[0] = new SavingsAccount(savAccNo, savBalance, savHolder, interestRate);

        System.out.println("\nEnter Checking Account details:");
        System.out.print("Account Number: ");
        String chkAccNo = scanner.nextLine();
        System.out.print("Holder Name: ");
        String chkHolder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double chkBalance = scanner.nextDouble();
        System.out.print("Daily Withdrawal Limit: ");
        double withdrawalLimit = scanner.nextDouble();
        scanner.nextLine();
        accounts[1] = new CheckingAccount(chkAccNo, chkBalance, chkHolder, withdrawalLimit);

        System.out.println("\nEnter Fixed Deposit Account details:");
        System.out.print("Account Number: ");
        String fdAccNo = scanner.nextLine();
        System.out.print("Holder Name: ");
        String fdHolder = scanner.nextLine();
        System.out.print("Deposit Amount: ");
        double fdBalance = scanner.nextDouble();
        System.out.print("Term (months): ");
        int termMonths = scanner.nextInt();
        System.out.print("Interest Rate (%): ");
        double fdInterestRate = scanner.nextDouble();
        accounts[2] = new FixedDepositAccount(fdAccNo, fdBalance, fdHolder, termMonths, fdInterestRate);

        System.out.println("\n--- All Bank Accounts ---");
        for (BankAccount account : accounts) {
            System.out.println();
            account.displayDetails();
        }

        System.out.println("\n--- Testing Account Operations ---");
        System.out.println("\nApplying interest to Savings Account:");
        ((SavingsAccount) accounts[0]).applyInterest();
        System.out.println("New Balance: $" + accounts[0].getBalance());

        System.out.println("\nAttempting to withdraw from Fixed Deposit:");
        accounts[2].withdraw(1000);

        scanner.close();
    }
}
