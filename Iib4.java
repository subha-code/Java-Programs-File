package sid.iib;
//Instance variable can directly access in IIB block

public class Iib4 {
    int i;
    static int j;
    {
        i=20; // ionstance variables can directly access in iib
        j=30; // static variables also be initialize into IIB
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        Iib4 obj = new Iib4();
    }

}
