package objectoriented.inheritance.hierarchicalinheritance;

public class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String holderName;

    public BankAccount() {
        this.accountNumber = "Unknown";
        this.balance = 0.0;
        this.holderName = "Unknown";
    }

    public BankAccount(String accountNumber, double balance, String holderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountType() {
        System.out.println("Account Type: Generic Bank Account");
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}
