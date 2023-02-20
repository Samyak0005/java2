package programs;

import java.util.HashSet;

public class HashsetDuplication {
    public static void main(String[] args) {

        int [] Marks = {30,70,70,80,90,55,98,99,30,99};

        boolean temp = false;
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer var: Marks){
            if (hashSet.add(var)==false){
                System.out.println("Duplication "+var);

                temp = true;
            }
        }
        if (temp == false){
            System.out.println("No Duplication");
        }
    }
}
