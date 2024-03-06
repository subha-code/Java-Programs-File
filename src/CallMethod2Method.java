public class CallMethod2Method{
    public static void main(String[] args){
        CallMethod2Method a1 = new CallMethod2Method();
        String x = a1.test1();
        System.out.println(x);
    }
    public String test1(){
        CallMethod2Method a2 = new CallMethod2Method();
         String y = a2.test2();

        return y;
    }
    public String test2(){
        System.out.println("hello");
        return "world";

    }
}