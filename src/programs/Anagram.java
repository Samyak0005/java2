package programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // silent
        String SecondName = sc.nextLine(); // listen

        name = name.toLowerCase(Locale.ROOT);
        SecondName = SecondName.toLowerCase(Locale.ROOT);

        char [] ch = name.toCharArray();
        char [] ch1 = SecondName.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        Boolean result = Arrays.equals(ch,ch1);
        if (result==true) {
            System.out.println(result);
        }else{
            System.out.println("this is not Anagram");
        }
    }
}
