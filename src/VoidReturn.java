public class VoidReturn{
    public static void main(String[] args) {
        VoidReturn obj = new VoidReturn();
        obj.test();

    }
    public void test(){
        System.out.println(100);
        return; // return goes to where the method called in main
        //sop(200); error lasr satement have to return
    }
}