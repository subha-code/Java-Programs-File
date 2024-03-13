package sid.iib;

public class IibLoop {

    {
        System.out.println("From IIB");
        new IibLoop();
    }

    public static void main(String[] args) {
        IibLoop obj = new IibLoop();
        System.out.println("From Main");
    }
}
