package programs;

public class CountTotalNoWords {
    public static void main(String[] args) {

        String name = "Samyak jain";
        int Count = 1;

        for (int i = 0; i<name.length(); i++){
            if (name.charAt(i)==' '){
                Count = Count + 1;
            }
        }
        System.out.println(""+Count+"  "+"  "+name);

    }
}
