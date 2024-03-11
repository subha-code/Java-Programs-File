public class ConsArg{
    ConsArg(int x){
        System.out.println(x);
      //  return 100; Error Constructor are void and cannot return any value
    }

    public static void main(String[] args) {
        ConsArg obj = new ConsArg(500);
    }
}