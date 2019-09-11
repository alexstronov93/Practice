import java.util.Arrays;

public class Thirteenth {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 12, 23, 7, 5, 4};
        System.out.println(Arrays.toString(a));
        int tmp = 0;
        for (int i = 0; i < a.length; i += 2) {
            tmp = a[i + 1];
            a[i + 1] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
