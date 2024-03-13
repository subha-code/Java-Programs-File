package ConstructorPractice;

public class OjectTOMethod {
    int i =10;
    void OjectTOMethod(){
        System.out.println("A");
    }
    OjectTOMethod(){
        System.out.println("From Hello World");
    }

    public static void main(String[] args) {
        new OjectTOMethod().OjectTOMethod();
    }
}
