package inheritance;
//multilevel inheritance
public class Class3 extends Class2 {
    public void test3(){
        System.out.println(3);
    }

    public static void main(String[] args) {
        Class3 obj = new Class3();
        obj.test1();
        obj.test2();
        obj.test3();
    }
}
