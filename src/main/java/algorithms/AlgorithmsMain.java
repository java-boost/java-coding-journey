package algorithms;

import java.util.Arrays;

public class AlgorithmsMain {
    static void main(String args[])
    {
        /* Tow Sum execution */
        TwoSum twoSum = new TwoSum();
        System.out.println("Indices of the two numbers"+ Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("Indices of the two numbers"+ Arrays.toString(twoSum.twoSum(new int[]{3,2,4}, 6)));
        System.out.println("Indices of the two numbers"+ Arrays.toString(twoSum.twoSum(new int[]{3,3}, 6)));
    }
}
