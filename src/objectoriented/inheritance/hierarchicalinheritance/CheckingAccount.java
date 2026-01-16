package objectoriented.inheritance.hierarchicalinheritance;

public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount() {
        super();
        this.withdrawalLimit = 0.0;
    }

    public CheckingAccount(String accountNumber, double balance, String holderName, double withdrawalLimit) {
        super(accountNumber, balance, holderName);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds daily limit of $" + withdrawalLimit);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayDetails() {
        displayAccountType();
        super.displayDetails();
        System.out.println("Daily Withdrawal Limit: $" + withdrawalLimit);
    }
}
