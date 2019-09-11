import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenNum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenNum++;
            }
        }
        System.out.println(Arrays.toString(a));
        int b[] = new int[evenNum];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[index] = a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
