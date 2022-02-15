package inheritence;

public class nomor3 {
    public static void main(String[] args){
        Kompleks K = new Kompleks();

        Kompleks K1 = new Kompleks(2.0,4.0);
        Kompleks K2 = new Kompleks(2.0,4.0);
        K1.info();
        K1.IsEqual(K1);
        K2.IsEqual(K1);

    }
}
class Kompleks{
    private double re,im;
    public Kompleks(){
        System.out.println("Konstruktor default");
    }
    public Kompleks (double i, double j){
        re = i; im=j;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public void info(){
        System.out.println(re + " + " + im + "*i" );
    }
    public void IsEqual(Kompleks Bil){
        if (re == Bil.getRe() && im == Bil.getIm()){
            System.out.println("Bilangan sama");
        } else {
            System.out.println("bilangan tidak sama");
        }
    }
}
