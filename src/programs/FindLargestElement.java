package programs;

public class FindLargestElement {
    public static void main(String[] args) {

        int [] Marks = {30,70,70,80,90,55,98,99,30,99};

        int temp = Marks[0]; // 30

        for (int i = 0; i< Marks.length; i++){
            if (Marks[i]>temp){
                temp = Marks[i];


            }
        }
        System.out.println(temp);
    }
}
