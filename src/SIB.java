public class SIB{
    static{ // static initialize block execute before any object call
        System.out.println("static - 1");

    }
    int age;
    {
        age=20;
        System.out.println("init-1"); // init block use for initialize value before constructor call
    }
   public SIB(){
        System.out.println("cons-1" + age);
    }

    public static void main(String[] args) {
        SIB obj = new SIB();
    }

}