import main.java.bank.BankProcessor;
import main.java.bank.SavingsAccount;
import main.java.User;
import main.java.bank.notification.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

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


    User newUser = new User();
    newUser.setFirstName("Vamsi");
    newUser.setMiddleName("Krishna");
    newUser.setLastName("Suryadevara");

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
    System.out.println(Arrays.toString(primitiveArray));
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

}
