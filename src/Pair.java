package generics;

//public class Pair {
//    Object x;
//    Object y;
//}
// class Test{
//     public static void main(String[] args) {
//         Pair p = new Pair();
//         p.x = 12;
//         p.y = "gfg";
//         String str = (String)p.x;
//     }

class Pair<T,S>
{
    T x;
    S y;
}
//class Test
//{
//    public static void main(String[] args) {
//        Pair <Integer,String> p = new Pair<>();
//        p.x=12;
//        p.y = "GFG";
//        String str = (String)p.x;
//    }
//}
