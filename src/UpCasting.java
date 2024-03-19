package Typecasting;

public class UpCasting {
    public static void main(String[] args) {
        int x =10;
        long y = x;
        System.out.println(y);

        short a = 2; // 2 bytes
        int b = a; // 4 bytes
        System.out.println(b);

        float c = 10.7f;
        double d = c;
        System.out.println(d);

        float e = 10.6f;
        long f = (long)e; // long supports all integers not fractional digits
        System.out.println(f);
    }
}
