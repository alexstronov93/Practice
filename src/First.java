import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i] % 5 == 0)
                sum += arr[i];
            System.out.println(Arrays.toString(arr));
            System.out.println("Sum is: " + sum);
        }
    }
}
