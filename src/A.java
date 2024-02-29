// Static variables or class variables
//Non-static variables or Object variables

public class A{
    static  int x =100;
    int y = 10;
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1.y);
        a1.y = 20;
        System.out.println(a1.y);
        A a2 = new A();
        System.out.println(a2.y);
        System.out.println(A.x);
    }
}