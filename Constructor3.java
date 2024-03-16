package ConstructorPractice;

public class Constructor3 {
    Constructor3(int x){
        System.out.println(x);
    }
    Constructor3(){

    }

    public static void main(String[] args) {
        Constructor3 obj1 = new Constructor3();
        Constructor3 obj2 = new Constructor3(100);
    }
}
