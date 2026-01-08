import main.java.BankProcessor;
import main.java.SavingsAccount;
import main.java.User;

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
}
