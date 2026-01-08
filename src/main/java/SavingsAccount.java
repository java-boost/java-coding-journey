package main.java;

// SavingsAccount IS-A BankAccount
public class SavingsAccount extends BankAccount {
    private final double interestRate = 0.05;

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest); // Using inherited method
    }
}
