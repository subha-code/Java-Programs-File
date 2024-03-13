package ConstructorPractice;

public class SopCallMeth {
    public static void main(String[] args) {
        SopCallMeth obj = new SopCallMeth();
        System.out.println(obj.test()); // store the value
    }
    public int test(){
        System.out.println("Hello");
        return 100;
    }
//    public void test(){
//        System.out.println("Hello"); void type not allow in sop
//
//    }
}
