package objectoriented.inheritance.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {
    private int termMonths;
    private double fixedInterestRate;

    public FixedDepositAccount() {
        super();
        this.termMonths = 0;
        this.fixedInterestRate = 0.0;
    }

    public FixedDepositAccount(String accountNumber, double balance, String holderName,
                                int termMonths, double fixedInterestRate) {
        super(accountNumber, balance, holderName);
        this.termMonths = termMonths;
        this.fixedInterestRate = fixedInterestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public double getFixedInterestRate() {
        return fixedInterestRate;
    }

    public void setFixedInterestRate(double fixedInterestRate) {
        this.fixedInterestRate = fixedInterestRate;
    }

    public double calculateMaturityAmount() {
        return balance + (balance * fixedInterestRate * termMonths / 1200);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed before maturity. Penalty may apply.");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayDetails() {
        displayAccountType();
        super.displayDetails();
        System.out.println("Term: " + termMonths + " months");
        System.out.println("Interest Rate: " + fixedInterestRate + "%");
        System.out.println("Maturity Amount: $" + calculateMaturityAmount());
    }
}
