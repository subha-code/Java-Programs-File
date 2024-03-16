package ConstructorPractice;

public class ParaConstructor {
    ParaConstructor(int x){ //should be mention the parameter constructor
        System.out.println(x);
    }
    public static void main(String[] args) {
        ParaConstructor obj = new ParaConstructor(100);
    }
}
