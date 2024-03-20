package p1;

public class B {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i);
        new p2.C().test(); // constructor call
        System.out.println(new p2.C().j);
//        p2.C c1 = new p2.C();
//        System.out.println(c1.j);
    }
}
