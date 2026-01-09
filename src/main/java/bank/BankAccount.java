package main.java.bank;

public class BankAccount {
    private double balance; // Hidden data

    // Controlled access via a "Getter"
    public double getBalance() {
        return balance;
    }

    // Validation logic inside a "Setter" equivalent
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
