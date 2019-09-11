import java.lang.reflect.Array;
import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        int[] arr = {15, 25, -3, 64};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("First is zero");
            } else if (i < 0) {
                System.out.println("First is negative");

            } else if (i > 0) {
                System.out.println("First if positive");
            }

        }
    }
}
