//Non-static and static method call from main
class Memory{
    public static void main(String[] args) {
        Memory a1 = new Memory();
        a1.test();
     //   Memory.test();
    }
    // non-static
    public void test(){
        System.out.println(100);
    }
   /* public static void test(){
        System.out.println(200);
    }*/
}