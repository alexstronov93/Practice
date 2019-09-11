import java.util.Arrays;

public class Tenth {
    public static void main(String[] args) {
        int arr[] = {1, 12, 3, 5, 25, 13};
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            else if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        arr[indexMin] = max;
        arr[indexMax] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }
}

