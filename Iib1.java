package sid.iib;

public class Iib1 {
    int i;
    int j;
    { // IIB Call when object created
        i=10;
        j=0;
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        Iib1 obj = new Iib1();

    }

}
