import java.util.Arrays;

public class Fourteenth {
    public static void main(String[] args) {
        int marks[]={2, 3, 5, 2, 3, 4, 4, 1, 2};
        System.out.println(Arrays.toString(marks));
        int count=0;
        for (int i = 0; i <marks.length ; i++) {
            if (marks[i]<=2){
                count++;
            }
        }
        System.out.print("Not allowed "+count+" students");
    }
}
