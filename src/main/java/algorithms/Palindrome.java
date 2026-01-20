package algorithms;

public class Palindrome {
    public boolean isPalindrome(int x) {

        boolean isPalindrome = false;
        String palindrome = Integer.toString(x);
        String reversePalindrome = new StringBuilder(palindrome).reverse().toString();
        isPalindrome = palindrome.equals(reversePalindrome)?true: false;
        return isPalindrome;
    }

    public boolean isPalindromeWithReverseHalf(int x) {

        if(x<0 || (x%10==0 &&x!=0)){
            return false;
        }

        int reverseHalf=0;
        while(x>reverseHalf){
            int lastdigit = x % 10;
            reverseHalf = (reverseHalf*10)+lastdigit;
            x/=10;
        }
        return x==reverseHalf || x==reverseHalf/10;
    }
}
