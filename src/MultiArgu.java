public class MultiArgu{
    public static void main(String[] args) {
        MultiArgu obj = new MultiArgu();
        obj.test(10,"Mike",7.5f);
    }
    public void test(int x,String y, float f){
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
    }
}