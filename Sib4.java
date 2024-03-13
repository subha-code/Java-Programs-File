package sid.iib;

public class Sib4 {
    {
        System.out.println("IIB");
    }
    static{
        Sib4 obj = new Sib4(); // we can create object in SIB
        System.out.println("SIB");
    }
    Sib4(){
        System.out.println("Sib4");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }

}
