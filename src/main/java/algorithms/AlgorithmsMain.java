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

        /*Palindrome execution */

        Palindrome palindrome = new Palindrome();
        System.out.println("Is 121 palindrome?"+ palindrome.isPalindrome(121));
        System.out.println("Is -121 palindrome?"+ palindrome.isPalindrome(-121));
        System.out.println("Is 10 palindrome?"+ palindrome.isPalindrome(10));
        System.out.println("Is 1111 palindrome?"+ palindrome.isPalindrome(1111));
        System.out.println("Is 1221 palindrome?"+ palindrome.isPalindrome(1221));
        System.out.println("Is 121 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(121));
        System.out.println("Is -121 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(-121));
        System.out.println("Is 10 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(10));
        System.out.println("Is 1111 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(1111));
        System.out.println("Is 1221 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(1221));
        System.out.println("Is 12321 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(12321));
        System.out.println("Is 0 isPalindromeWithReverseHalf?"+ palindrome.isPalindromeWithReverseHalf(0));
    }
}
