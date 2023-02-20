package programs;

import java.util.HashMap;
import java.util.HashSet;

public class OccurrenceOfWords {
    public static void main(String[] args) {

        String name = "Java is good Language but python is also good";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word: name.split(" ")){
            if (hashMap.containsKey(word)){

                hashMap.put(word, hashMap.get(word) + 1);
            }else{

                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);

    }
}
