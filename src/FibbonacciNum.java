import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibbonacciNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit size of sequence");
        int size = scanner.nextInt();
        int[] sequence = new int[size];
        System.out.println("Insert elements of sequence");
        for (int i = 0; i < size; i++) {
            sequence[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
        }
        System.out.println(areFibNumbers(sequence));
    }


    public static boolean areFibNumbers(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence.length < 2) return false;
            if (sequence[i+2]==sequence[i]+sequence[i+1]) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}