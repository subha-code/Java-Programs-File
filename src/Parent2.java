package code.polymorphism;

public class Parent2 extends Overriding2{
    public void test1(){
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        Parent2 obj = new Parent2();
        obj.test1();
        obj.test2();
    }
}
