package eas2021;

interface Inter{
    int number();
}
abstract class Abs{
    static int foo = 12;
    int number() {
        return 5;
    }
    abstract int ace();
}
final class Sub extends Super {
    Sub(int bar){ foo = bar;}
    public int number(){return 10;}
    int ace(){return 13;}
    int dub(int i){return 2*i;}
}
class Super extends Abs implements Inter {
    public int number(){return 11;}
    int twice(int x){return 2*x;}
    public int thrice(int x){return 3*x;}
    int ace(){return 1;}
    String dub(String s) {return s+s;}
}
class no5 {
    public static void main(String args[]){
        Super s1 = new Super();
        System.out.println(s1.twice(3));
        System.out.println(s1.dub(6));
        System.out.println(s1.number());
    }
}
