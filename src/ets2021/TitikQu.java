package ets2021;

public class TitikQu {
    private double x,y;

    public TitikQu(){
        x = 0;
        y = 0;
    }
    public TitikQu(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double jarak(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public double Gradient(TitikQu T){
        return (this.y - T.y)/(this.x - T.x);
    }
}
class main {
    public static void main(String args[]) {
        TitikQu T1 = new TitikQu(10, 8);
        TitikQu T2 = new TitikQu(10, 8);
        System.out.println(T1.jarak());
        System.out.println(T2.jarak());
        System.out.println(T1.Gradient(T2));
    }
}