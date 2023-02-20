package programs;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : ");
        int a = sc.nextInt();
        System.out.println("Enter value b : ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping  "+a);
        System.out.println("After Swapping  "+b);
    }
}
