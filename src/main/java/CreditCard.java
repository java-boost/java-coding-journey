package main.java;

// The "Implementation"
public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
