public class ThisProgram2{
    int x;
    public ThisProgram2(int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        ThisProgram2 obj = new ThisProgram2(5);
        System.out.println(obj.x);
    }
}
