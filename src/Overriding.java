package code.polymorphism;

class Parent {
    public void test(){
        System.out.println("A");
    }
}
public class Overriding {
    public void test(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        Overriding b1 = new Overriding();
        b1.test();
        Parent a1 = new Parent();
        a1.test();
    }
}
