package ConstructorPractice;

public class StaticMethodPassValue {
    public static void main(String[] args) {

        StaticMethodPassValue.test1(10);
    }
public  static void test1(int i){
    System.out.println(i);
    return;
}
}
