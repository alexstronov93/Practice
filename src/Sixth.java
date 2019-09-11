import java.util.Arrays;

public class Sixth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = 0;
        int max = 0;
        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) {
            System.out.println("Is zero");
        } else if (arr.length == 1) {
            System.out.println(arr[0]);
        } else if (arr.length > 0) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Min is: " + min + " Max is: " + max);
        }
    }
}