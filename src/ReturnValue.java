public class ReturnValue{
    public static void main(String[] args) {
        ReturnValue obj = new ReturnValue();
        int x = obj.test();
        System.out.println(x);
    }
    public int test(){

        return 100;
    }
}