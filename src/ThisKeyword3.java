package ThisKeyword;

public class ThisKeyword3 {
    static int x =10;

    public static void main(String[] args) {
        ThisKeyword3 obj = new ThisKeyword3();
        obj.test();
    }
    public void test(){
        System.out.println(this.x); //  A.x
    }
}
