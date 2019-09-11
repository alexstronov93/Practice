import java.util.Scanner;
import java.util.SortedMap;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println("Put day");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int day = d % 7;
        if (day == 0)
            System.out.println("Sunday");
        else if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wendsday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        if (day>=1 && day<=31)
            System.out.println("January");
        else if (day>31 && day<=59)
            System.out.println("February");
        else if (day>59&& day<=80)
            System.out.println("March");
        }
    }

