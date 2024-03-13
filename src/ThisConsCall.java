package ThisKeyword;

public class ThisConsCall {
    ThisConsCall(int x){
        System.out.println(x);
    }
    ThisConsCall(){
        this(100);
    }

    public static void main(String[] args) {
        ThisConsCall obj = new ThisConsCall();
    }
}
