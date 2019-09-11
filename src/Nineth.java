public class Nineth {
    public static void main(String[] args) {
        int s[] = {-5, 12, -12, 5, 0, 0, 32, -16};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 0) {
                zero++;
            } else if (s[i] < 0) {
                negative++;
            } else if (s[i] > 0) {
                positive++;
            }
        }
        System.out.println("Count of negative: " + negative);
        System.out.println("Count of positive: " + positive);
        System.out.println("Count of zero: " + zero);
    }
}
