package programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String name = "kasak";
        String rev = "";

        for (int i = name.length()-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("This is not Palindrome");
        }
    }
}
