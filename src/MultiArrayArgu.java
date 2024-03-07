public class MultiArrayArgu{
    public static void main(String[] args) {
        MultiArrayArgu obj = new MultiArrayArgu();
        obj.test(10,20,30,40);
    }
     public void test(int... x){ // local variable // nvar cant be used
                                 // x : [10,20,30]
       /*  System.out.println(x[0]);
         System.out.println(x[1]);
         System.out.println(x[2]);
         System.out.println(x[3]);*/
         System.out.println(x);// print the array base address [I@36baf30c

     }
}