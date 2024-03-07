public class CompareString{
    public static void main(String[] args){
        CompareString obj = new CompareString();
        obj.Compare();
        String s1 = new String("hello");
        String s2 = new String("hello");
        if(s1==s2){ // '==' compare the object  address
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }

    public void Compare(){

        String s1 = new String("hello");
        String s2 = new String("hello");
        if(s1.equals(s2)){ // equals method compare beween the values
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}