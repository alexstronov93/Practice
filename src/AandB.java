public class AandB {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        System.out.println(a+"  "+b);
        a=a^b;
        System.out.println(a);
        b=b^a;
        System.out.println(b);
        a=a^b;
        System.out.println(a+" "+b);
    }
}
