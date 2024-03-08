public class poly{
    int age;
    static{
        System.out.println("Static-1");
    }
    static{
        System.out.println("Static-2");
    }
    {
        age = 20;
        System.out.println("init-1");
    }
    {
        System.out.println("init-2");
    }
    public poly(){
        this(20);
        System.out.println("Cons-1: "+age);
    }
    public poly(int a){
        System.out.println("Const-2"+age);
    }

    public static void main(String[] args) {
        poly obj = new poly();
        poly obj2 = new poly();
    }
}