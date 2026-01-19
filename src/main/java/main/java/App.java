package main.java;

import bank.BankProcessor;
import bank.SavingsAccount;
import main.java.User;
import bank.notification.*;
import bank.service.Result;
import bank.service.UserService;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        byte verySmallNumeric = 122;
        short smallNumeric = 31000;
        int mediumNumeric = 456000000;
        long largeNumeric = 4560000000L;
        float mediumDecimalNumeric = 45.6f;
        double largeDecimalNumeric = 46.9;
        boolean booleanValue = true;
        char character = 'A';
        String stringValue = "Non-Primitive";
        int[] primitiveArray = {456000000,3456,5678};

        User newUser = new User("Vamsi","Krishna","Suryadevara");

        System.out.println(verySmallNumeric);
        System.out.println(smallNumeric);
        System.out.println(mediumNumeric);
        System.out.println(largeNumeric);
        System.out.println(mediumDecimalNumeric);
        System.out.println(largeDecimalNumeric);
        System.out.println(booleanValue);
        System.out.println(character);
        System.out.println(stringValue);
        System.out.println(primitiveArray);
        System.out.println(java.util.Arrays.toString(primitiveArray));
        System.out.println(newUser);

        /* Object oriented concepts */

        SavingsAccount mySavings = new SavingsAccount();
        mySavings.deposit(500);
        mySavings.applyInterest();

        BankProcessor processor = new BankProcessor();
        processor.giveBonus(mySavings); // Polymorphism in action

        System.out.println("Final Balance: " + mySavings.getBalance());

        /* Sealed class concept */

        // 1. Initialize the Service
        NotificationService service = new NotificationService();

        // 2. Create different types of notifications
        // Using a Record
        Notification sms = new SMS("Your OTP is 1234", "+123456789");

        // Using a standard class
        Notification email = new Email("Welcome to our platform!", "user@example.com");

        // Using the 'non-sealed' extension (Polymorphism in action)
        Notification marketing = new MarketingEmail("Big Sale Today!", "customer@test.com", "SUMMER_2026");

        // Using a high-priority system alert
        Notification alert = new SystemAlert("Database Connection Lost", 500);

        // 3. Execute processing
        System.out.println("--- Processing SMS ---");
        service.processNotification(sms);

        System.out.println("\n--- Processing Standard Email ---");
        service.processNotification(email);

        System.out.println("\n--- Processing Marketing Email ---");
        // This works because MarketingEmail extends Email, which implements Notification
        service.processNotification(marketing);

        System.out.println("\n--- Processing System Alert ---");
        service.processNotification(alert);

        /* Result patter example*/
        UserService userService = new UserService();
        Result<User> result = userService.getUserById("");

        // Pattern matching extracts the data automatically
        String message = switch (result) {
            case Result.Success<User> s -> "User found: " + s.data().firstName();
            case Result.Failure<User> f -> "Error [" + f.errorCode() + "]: " + f.message();
            case Result.Loading<User> l -> "Fetching data... please wait.";
        };

        System.out.println(message);
    }
}
