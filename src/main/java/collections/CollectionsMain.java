import main.java.bank.BankProcessor;
import main.java.bank.SavingsAccount;
import main.java.User;
import main.java.bank.notification.*;
import main.java.bank.service.Result;
import main.java.bank.service.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome to Collections!"));

    List<String> list = new ArrayList<>();
    list.add("Java");   // Fast: O(1)
    list.add(0, "C++"); // Slow: O(n) because "Java" must be shifted to index 1

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.addFirst("First"); // Very Fast: O(1)
    linkedList.get(0);          // Very Slow: O(n)

    // 1. Use the Interface as the type (Abstraction)
    List<Integer> numbers = new ArrayList<>();

    // 2. Efficiently adding multiple items
    numbers.addAll(Arrays.asList(10, 20, 30, 40));

    // 3. Functional approach (Java 8+)
    numbers.removeIf(n -> n > 25); // Removes 30 and 40

    // 4. Sorting (uses TimSort under the hood)
    numbers.sort(Comparator.reverseOrder());

    System.out.println("Modified List: " + numbers);

    // 5. Converting to Array
    Integer[] array = numbers.toArray(new Integer[0]);

    List<String> frameworkList = new ArrayList<>(Arrays.asList("Kafka", "Spring", "Java", "Docker"));

    ListIterator<String> it = frameworkList.listIterator();

    while (it.hasNext()) {
        String item = it.next();

        // 1. Safe Removal
        if (item.equals("Docker")) {
            it.remove();
        }

        // 2. Safe Modification (Replace)
        if (item.equals("Java")) {
            it.set("Modern Java (Records/Sealed)");
        }

        // 3. Safe Addition
        if (item.equals("Kafka")) {
            it.add("Zookeeper"); // Adds Zookeeper immediately after Kafka
        }
    }

    System.out.println(frameworkList);

    List<String> copyOnWriteArrayListlist = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C"));

    // This iterator sees "A", "B", "C"
    for (String s : copyOnWriteArrayListlist) {
        System.out.println("Reading: " + s);

        // This modification creates a NEW array in the background
        copyOnWriteArrayListlist.add("NewItem");
    }

    // The modifications only show up AFTER the iteration is done
    System.out.println("Final List Size: " + copyOnWriteArrayListlist.size()); // Size will be 6

}// }
