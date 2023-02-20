package programs;

public class SecondLargestElement {
    public static void main(String[] args) {

        int [] Marks = {30,70,70,80,90,55,98,30,99};

        int temp;

        for (int i = 0; i< Marks.length; i++) {
            for (int j = i + 1; j < Marks.length; j++) {

                if (Marks[i] < Marks[j]) {

                    temp = Marks[i];
                    Marks[i] = Marks[j];
                    Marks[j] = temp;
                }
            }
            if (i == 1) {
                break;
            }
        }
        System.out.println(Marks[1]);

    }
}
