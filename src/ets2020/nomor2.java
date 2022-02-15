package ets2020;

public class nomor2 {
    public static void main(String[] args){
        Complex c1 = new Complex(3,4);
        System.out.println(c1);
        System.out.println("Modulus dari c1 adalah : " + c1.modulus());
        Complex c3 = c1;
        System.out.println(c3);
    }
}
class Complex {
    private double re,im;
    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }
    public double modulus(){
        return Math.sqrt(Math.pow(re,2)+Math.pow(im,2));
    }
    public String toString(){
        return "(" + re + " + " + im + "i)";
    }
}