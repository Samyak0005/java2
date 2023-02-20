package programs;

public class FindDuplication {
    public static void main(String[] args) {

        int [] Marks = {30,70,70,80,90,55,98,99,30,99};

        for (int i = 0; i<Marks.length; i++){
            for (int j = i+1; j< Marks.length; j++){

                if (Marks[i]==Marks[j]){
                    System.out.println("Duplication "+Marks[i]);
                }
            }
        }
    }
}
