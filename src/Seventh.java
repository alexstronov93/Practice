import java.util.Arrays;

public class Seventh {
    public static void main(String[] args) {
        int arr[] = {25, 12, 32, 23, 12, 15, 35};
        int num = 20;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                arr[i] = num;
            }
            if (arr[i]==num){
                count++;
            }
            System.out.println(arr[i]+"  ");
        }

        System.out.println("Number of count: "+count);
    }
}
