import java.util.Arrays;

public class Fifteenth {
    public static void main(String[] args) {
        int arr[]={23, 12, 54, 5, 654, 0, 3, 12, 3};
        System.out.println(Arrays.toString(arr));
        int zero=0;
        for (int i = 0; i <arr.length ; i++) {
           do {
               System.out.print(arr[i++]+"  ");
           }
           while (arr[i]!=0);
           break;
        }
    }
}
