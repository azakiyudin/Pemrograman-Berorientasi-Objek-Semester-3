package latconstructor;

public class lingkaran extends bentuk{
    private double radius;

    public lingkaran (double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double hitungLuas(){
        return Math.PI*this.radius*this.radius;
    }

    public void printInfo(){
        System.out.println("Lingkaran " + getWarna() + ", luas = " + hitungLuas());
    }
}
