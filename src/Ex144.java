import java.util.Arrays;

public class Ex144 {
    public static void main(String[] args) {
        int arr[] = {24, 6, 12, 36};
        System.out.println(Arrays.toString(arr));

        System.out.println("GCD is : ");
    }

    public static int gcd(int a, int b) {
        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}

