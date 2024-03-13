package ThisKeyword;

public class ThisConsCall2 {
    ThisConsCall2(){
        System.out.println("A");
    }
    ThisConsCall2(int x){
        this();//call the constructor
    }

    public static void main(String[] args) {
        ThisConsCall2 obj = new ThisConsCall2(100);
    }
}
