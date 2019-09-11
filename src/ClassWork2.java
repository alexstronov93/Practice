import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(Long.toBinaryString(number));
        System.out.println(Long.bitCount(number));
    }
}
