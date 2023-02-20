package programs;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Arm = sc.nextInt();

        int temp = Arm;
        int n,rem=0;

        while (Arm>0){
            n = Arm%10;
            Arm = Arm/10;

            rem = rem + n*n*n;
        }
        if (temp == rem){
            System.out.println("Armstrong no "+rem);
        }else{
            System.out.println("this is not Armstrong ");
        }
    }
}
