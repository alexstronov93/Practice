import java.util.Arrays;

public class TeslaAuc {
    public static void main(String[] args) {
        String daysOfWeek[] = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("day of week is " + daysOfWeek[i]);
        }
        System.out.println();

        double[] sharePrice = new double[]{123.5643, 523.213, 231.31, 1232.7, 867.21, 234.213, 53.456};
        double minPrice = sharePrice[0];
        double maxPrice = sharePrice[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < sharePrice.length; i++) {
            System.out.println("Share price is " + sharePrice[i]);
        }
        System.out.println();
        for (int i = 0; i < sharePrice.length; i++) {
            if (sharePrice[i] < minPrice) {
                minPrice = sharePrice[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < sharePrice.length; i++) {
            if (sharePrice[i] > maxPrice) {
                maxPrice = sharePrice[i];
                maxIndex = i;
            }
        }
        System.out.println("Min price is: " + minPrice + "   Max price is: " + maxPrice);
        System.out.println("Index of min: " + minIndex + "   Index of max: " + maxIndex);
        System.out.println();
        int buyDay = minIndex + 1;
        int sellDay = maxIndex + 1;
        System.out.println("Best day for buy is " + buyDay);
        System.out.println("Best day for sell is " + sellDay);

    }
}