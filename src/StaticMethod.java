public class StaticMethod
{
    public static void main(String[] args) {
        StaticMethod.test1();
    }
    public static void test1(){
        StaticMethod.test2();
    }
    public static void test2(){
        System.out.println(100);
    }




}