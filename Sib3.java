package sid.iib;

public class Sib3 {
    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }
   Sib3(){
       System.out.println("From Constructor");
   }
    public static void main(String[] args) {
        Sib3 obj = new Sib3();
    }
}
