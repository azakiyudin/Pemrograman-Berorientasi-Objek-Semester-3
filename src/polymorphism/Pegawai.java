package polymorphism;

public class Pegawai {  //class parents pegawai
    String nama;    //protected
    int gaji;       //protected

    //constructor
    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    //mengembalikan nilai gaji
    public int infoGaji(){
        return this.gaji;
    }
}
