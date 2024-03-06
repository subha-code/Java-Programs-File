public class MethodCall2{
    public static void main(String[] args){
        MethodCall2 a = new MethodCall2();
        a.test();
        a.test();
      //  static int x = 10; static method cannot use in main
        
    }
    public void test(){
        System.out.println(100);
    }
}