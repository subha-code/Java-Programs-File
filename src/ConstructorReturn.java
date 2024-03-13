package ConstructorPractice;

public class ConstructorReturn {
    public static void main(String[] args) {
        ConstructorReturn obj = new ConstructorReturn();
        System.out.println("Main");
    }
    ConstructorReturn(){
        System.out.println("ConstructorReturn value");
        return;
    }
}
