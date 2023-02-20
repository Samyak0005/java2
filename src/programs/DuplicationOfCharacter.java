package programs;

import java.util.HashSet;

public class DuplicationOfCharacter {
    public static void main(String[] args) {

        String name = "Java is good ";

        name = name.replace(" ","");

        char [] ch = name.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();

        Boolean result = false;
        for (Character var: ch){
            if (hashSet.add(var)==false){
                System.out.println(" Characters Duplication "+var);

                result = true;
            }
        }
        if (result == false){
            System.out.println("No Characters Duplication");
        }

    }
}
