//Overloading constructore different argumrnts
public class ConsOverloading{
    ConsOverloading(){
        System.out.println("Constructor default");
    }
    ConsOverloading(int x){// noOfArga=1
        System.out.println(x);
    }
    ConsOverloading(int x,int y){// noOfArgs=2
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ConsOverloading obj1 =new ConsOverloading();
        ConsOverloading obj2 = new ConsOverloading(100);
        ConsOverloading  obj3 = new ConsOverloading(500,200);
    }
}