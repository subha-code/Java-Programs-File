//Overloading constructor different type of datatype args
public class ConsOverlading2{
    ConsOverlading2(int x){ //noOfArgs=1,type=int
        System.out.println(x);
    }
    ConsOverlading2(float x){ //noOfArgs=1,type=float
        System.out.println(x);
    }
    ConsOverlading2(char x){ //noOfArgs=1,type=char
        System.out.println(x);
    }

    public static void main(String[] args) {
        ConsOverlading2 obj1 = new  ConsOverlading2(10.3f);
        ConsOverlading2 obj2 = new  ConsOverlading2(10);
        ConsOverlading2 obj3 = new  ConsOverlading2('s');

    }
}