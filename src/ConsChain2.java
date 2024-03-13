package ThisKeyword;

public class ConsChain2 {
    ConsChain2(){
        System.out.println("A");
    }
    ConsChain2(int x){
        ConsChain2 obj2 = new ConsChain2();
    }
    ConsChain2(int x,int y){
        ConsChain2 obj1 = new ConsChain2(100);
    }

    public static void main(String[] args) {
        ConsChain2 obj = new ConsChain2(100,200);
    }
}
