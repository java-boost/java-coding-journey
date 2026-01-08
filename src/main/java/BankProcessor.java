package main.java;

public class BankProcessor {
    public void giveBonus(BankAccount account) {
        // This works for SavingsAccount, CheckingAccount, etc.
        // It uses "Dynamic Polymorphism" to call the right version of a method
        account.deposit(100.00);
    }
}
