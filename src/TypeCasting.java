package Typecasting;

public class TypeCasting {
    public static void main(String[] args) {
        long x = 10;
        float y =x;
        System.out.println(y); // if extra value add then it is upcasting


        int a ='{';
        char b = 'a';
        int c = b; // contains unicode value of the character
        System.out.println(a);
        System.out.println(c);

        int d = 10;
        var e = d;
        char f = 's';
        var g = f; // var can store any datatype values
        System.out.println(e);
        System.out.println(g);

    }
}
