package mypackage1;
 // Private access specifier
public class A {
    private int x =10;
    private void test(){
        System.out.println("From test");
    }

     public static void main(String[] args) {
         A a1 = new A();
         System.out.println(a1.x);
         a1.test();
     }
}
