import java.util.Arrays;

public class Eleventh {
    public static void main(String[] args) {
        int arr[]= {24, 12 ,3, 12, 4, 1, 2, 23, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<=i){
                System.out.println("arr[i]<="+i+"  "+arr[i]);
            }
        }
    }
}
