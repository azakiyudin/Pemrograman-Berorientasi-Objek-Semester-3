package modul1;

public class Mobil {
    String merk, warna, jenis;
    int ccmobil, kapasitaspenumpang;
    void InfoMobil(){
        System.out.println("Merk mobil = " + this.merk);
        System.out.println("Warna mobil = " + this.warna);
        System.out.println("Jenis mobil = " + this.jenis);
        System.out.println("CC mobil = " + this.ccmobil + " CC");
        System.out.println("Kapasitas penumpang = " + this.kapasitaspenumpang + " penumpang");
        System.out.println();
    }
}