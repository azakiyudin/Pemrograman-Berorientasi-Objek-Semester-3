package ets2020;

public class nomor3 {
    public static void main(String[] args){
        B b1 = new B(2,3,3);
        A a1 = new A(4,2);
        a1.show();
        b1.show();
    }
}
class A {
    int i, j;
    A(){
        i=0;
        j=0;
    }
    A(int a,int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("nilai i j adalah " + i + " " + j);
    }
}
class B extends A{
    int k;
    B() {
        i=0;
        j=0;
        k=0;
    }
    B(int a, int b, int c){
        i = a;
        j = b;
        k = c;
    }
    void show(){
        System.out.println("nilai i j adalah " + i + " " + j);
    }
}