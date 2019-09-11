import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 0, 12, 32, 0};
        int[] result = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
