package polymorphism;

class Base {
    public static void main(String[] args) {
        A a = new A("tes");
        a.print();
    }
}
class A {
    String s;

    A(String s){
        this.s = s;
    }
    public void print(){
        System.out.println(s);
    }
}
