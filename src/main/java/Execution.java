import java.lang.reflect.Array;
import java.util.Arrays;

public class Execution {
    public static void main(){

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
    }
}
