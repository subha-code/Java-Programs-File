package Typecasting;

public class DownCasting {
    public static void main(String[] args) {
//        int x = 2;
//        byte y =x;
//        System.out.println(y);

        int x = 100000;
        byte y = (byte)x; // 127 to -128
        System.out.println(y);

        double a = 10.5;
        float b = (float)a;
        System.out.println(b);

        long c = 100;
        int d = (int)c;
        System.out.println(d);



    }


}
