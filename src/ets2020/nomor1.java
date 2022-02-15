package ets2020;


public class nomor1 {
    public static void main(String[] args){
        Persegi A = new Persegi("Merah",8);
        A.info();
    }
}
class Bentuk{
    String Warna;
    public Bentuk(String x){
        System.out.println("Konstruktor Bentuk dipanggil");
        Warna = x;
    }
}
class Persegi extends Bentuk{
    private int sisi;
    public Persegi(String iniparam, int B){
        super(iniparam); // Ini kurangnya
        System.out.println("Konstruktor Persegi dipanggil");
        sisi = B;
    }
    public void info(){
        System.out.println("Warna persegi adalah : " + Warna);
        System.out.println("Ukuran adalah : " + sisi);
    }
}