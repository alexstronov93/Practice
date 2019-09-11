import java.util.Arrays;

public class Fourth {
    public static void main(String[] args) {
        int[] s = {2, 3, 5, 6, 12, 18,};
        System.out.println(Arrays.toString(s));
        boolean up = true;
        for (int i = 1; i < s.length; i++) {
            if (s[i] <= s[i - 1]) {
                up = false;
            }
        }
        if (up) {
            System.out.println("Is growing");
        } else {
            System.out.println("Is falling");
        }
    }
}
