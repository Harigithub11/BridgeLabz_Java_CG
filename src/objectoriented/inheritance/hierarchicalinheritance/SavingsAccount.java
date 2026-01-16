package objectoriented.inheritance.hierarchicalinheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount() {
        super();
        this.interestRate = 0.0;
    }

    public SavingsAccount(String accountNumber, double balance, String holderName, double interestRate) {
        super(accountNumber, balance, holderName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " applied.");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayDetails() {
        displayAccountType();
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
