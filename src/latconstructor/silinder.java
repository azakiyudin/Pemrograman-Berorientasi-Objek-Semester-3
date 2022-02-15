package latconstructor;

public class silinder extends lingkaran{
    private double tinggi;

    public silinder (double tinggi, double radius, String warna){
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public void setTinggi(double t){
        this.tinggi = t;
    }

    public double hitungVolume(){
        return hitungLuas()*this.tinggi;
    }

    public void printInfo(){
        System.out.println("Silinder warna " + getWarna() + ", volume = " + hitungVolume());
    }
}
