package programs;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Samyak";

        String rev = "";
        char [] ch = name.toCharArray();

        for (int i = name.length()-1; i>=0; i--){
            rev = rev+ch[i];
        }
        System.out.println(rev);
    }
}
