package kelas;

public class cLingkaran extends cBangunDatar{
    private double jari;

    public void setJari(double r){
        this.jari = r;
    }
    public double hitungLuas(){
        return Math.PI*this.jari*this.jari;
    }

    public void infoLingkaran(){
        System.out.println("Luas lingkaran " + hitungLuas());
        System.out.println("Warna " + getWarna());
    }
}
