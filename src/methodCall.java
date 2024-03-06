public class methodCall{
    public static void main(String[] args){
        methodCall obj1 = new methodCall();
        String x = obj1.test(); // store the retrun value in x
        System.out.println(x);
    }
    public String test(){ // it's a non-void method and returns value
        System.out.println("Welcome");
        return "Mike";
    }
}