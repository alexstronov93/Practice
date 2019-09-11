public class DoWhile {
    public static void main(String[] args) {
        int s = 546_213_547;
        while (s > 0) {
            int k = s % 10;
            System.out.println("digit is " + k);
            if (k % 2 == 0 && k % 3 == 0)
                System.out.println("fizzbuzz");
            else if (k % 2 == 0)
                System.out.println("fizz");
            else if (k % 3 == 0)
                System.out.println("buzz");
            else
                System.out.println("not multiple");
            System.out.println(" ");
            s /=10;
        }
        System.out.println(Integer.MAX_VALUE);

    }
}
