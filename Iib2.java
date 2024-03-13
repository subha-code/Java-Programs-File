package sid.iib;

public class Iib2 {
    {
        System.out.println("IIB");
    }
    Iib2(){
        System.out.println("From Constructor");
    }

    public static void main(String[] args) {
        Iib2 obj1 = new Iib2();
        Iib2 obj2 = new Iib2();
    }
}
//first IIB call then constructor will call