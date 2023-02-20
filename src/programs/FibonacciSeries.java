package programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3;
        System.out.println(n1);

        for (int i = 0; i<n; i++){

            n3 = n2 + n1;
            n2 = n1;
            n1 = n3;

            System.out.println(n3);
        }
    }
}
