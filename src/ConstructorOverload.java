public class ConstructorOverload{
    public ConstructorOverload(){
        System.out.println("cons-1");
    }
    public ConstructorOverload(String s){
        System.out.println("cons-2");
    }
    public ConstructorOverload(int a){
        System.out.println("cons-3");
    }
    public ConstructorOverload(int a,int b){
        this(a);
        System.out.println("cons-4");
    }
    public static void main(String[] args){
        ConstructorOverload obj = new ConstructorOverload(5,4);
    }
}