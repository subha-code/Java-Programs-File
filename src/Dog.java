package inheritance;

public class Dog extends Animal{
    public static void main(String[] args) {
      Dog obj = new Dog();
//        Animal obj = new Animal();
        obj.eat();
        obj.sleep();
        obj.walk();
        obj.noise();
    }
    public void noise(){
        System.out.println("Bow Bow");
    }

}
