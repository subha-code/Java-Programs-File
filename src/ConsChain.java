package ThisKeyword;

public class ConsChain {
    ConsChain(){
        System.out.println("A");
    }
    ConsChain(int x){
        this();
    }
    ConsChain(int x,int y){
        this(100);
    }

    public static void main(String[] args) {
        ConsChain obj = new ConsChain(100,200);
    }
}
