package programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();

        int temp = Palindrome;
        int n, rem = 0;

        while (Palindrome>0){

            n = Palindrome%10;
            Palindrome = Palindrome/10;

            rem = (10*rem)+n;
        }if (temp == rem){
            System.out.println("Palindrome no Available ");
        }else{
            System.out.println("No Palindrome Available");
        }
    }
}
