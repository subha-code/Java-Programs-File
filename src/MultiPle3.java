package inheritance;

public class MultiPle3 extends MultiPle,Multiple2{ // error Multiple inheritence cammot support in java
    public static void main(String[] args) {
        MultiPle3 obj = new MultiPle3();
        obj.test();
    }
}
