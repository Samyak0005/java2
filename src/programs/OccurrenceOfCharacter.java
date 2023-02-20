package programs;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {

        String name = "Java is good Language";

        int temp = name.replace("a","").length();
        int temp1 = name.length();

        int result = temp1-temp;
        System.out.println("a " +" "+result+" "+ " times ");
    }

}
