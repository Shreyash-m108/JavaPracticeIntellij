package DSA;

import com.practice.StringBuilders;

public class PalindromeOrNot {
    static void Palindrome(String str){
        StringBuilder builder = new StringBuilder(str);
        String reversed = String.valueOf(builder.reverse());
        if (str.equals(reversed)){
            System.out.println("This is a Palindrome string.");
        }
        else {
            System.out.println("This is not Palindrome String.");
        }
    }

    public static void main(String[] args) {
        String str="abcdcbna";
        Palindrome(str);
    }
}
