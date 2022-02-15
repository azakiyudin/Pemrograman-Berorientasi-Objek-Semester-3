package polymorphism;

public class Programmer extends Pegawai{
    int bonus;
    public Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    public int infoGaji(){
        return this.gaji;
    }
    public int infoBonus(){
        return this.bonus;
    }
}
