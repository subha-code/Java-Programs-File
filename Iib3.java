package sid.iib;

public class Iib3 {
    Iib3(){
        System.out.println("From Constructor");
    }

    {
        System.out.println("From IIB - 2");
    }
    {
        System.out.println("From IIB -1");
    }

    public static void main(String[] args) {
        Iib3 obj = new Iib3();
    }
}
