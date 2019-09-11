public class ClassWorkLesion4 {
    public static void main(String[] args) {
        int a = 25;
        int b = 60;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a,b));
    }

    public static int gcd(int a, int b) {
        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
        }
    }

