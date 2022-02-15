package polymorphism;

public class Manajer extends Pegawai {      //class anak yaitu manajer
    int tunjangan;
    public Manajer(String nama, int gaji, int tunjangan){
        super(nama,gaji);
        this.tunjangan = tunjangan;
    }
    public int infoGaji(){
        return this.gaji;
    }
    public int infoTunjangan(){
        return this.tunjangan;
    }
}
