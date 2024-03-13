package ThisKeyword;

public class ThisKeyword2 {
    int x =10;

    public static void main(String[] args) {
        ThisKeyword2 obj = new ThisKeyword2();
        obj.test();
    }
    public void test(){
        System.out.println(x); // this.x
    }
}
