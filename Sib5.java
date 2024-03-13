package sid.iib;

public class Sib5 {
    static{
        System.out.println("SIB");
    }
    static{
        System.out.println("Hello");
        new Sib5();
    }
    {
        System.out.println("IIB");
    }

    public static void main(String[] args) {
        new Sib5();
    }
}
