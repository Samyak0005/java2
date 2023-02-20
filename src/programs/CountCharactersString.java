package programs;

import java.util.Scanner;

public class CountCharactersString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int count = 0;

        for (int i = 0; i<name.length(); i++){
            if (name.charAt(i)!=' '){
                count = count + 1;
            }
        }
        System.out.println(count);

    }
}
