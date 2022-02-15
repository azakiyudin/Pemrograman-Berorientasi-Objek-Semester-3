package modul1;

public class TesMobil {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Biru";
        mobil1.jenis = "minibus";
        mobil1.ccmobil = 2000;
        mobil1.kapasitaspenumpang = 7;
        System.out.println("=====MOBIL 1=====");
        mobil1.InfoMobil();

        Mobil mobil2 = new Mobil();
        mobil2.merk = "Daihatsu";
        mobil2.warna = "Hitam";
        mobil2.jenis = "pick up";
        mobil2.ccmobil = 1500;
        mobil2.kapasitaspenumpang = 2;
        System.out.println("=====MOBIL 2=====");
        mobil2.InfoMobil();

        Mobil mobil3 = new Mobil();
        mobil3.merk = "Suzuki";
        mobil3.warna = "Silver";
        mobil3.jenis = "suv";
        mobil3.ccmobil = 1800;
        mobil3.kapasitaspenumpang = 5;
        System.out.println("=====MOBIL 3=====");
        mobil3.InfoMobil();

        Mobil mobil4 = new Mobil();
        mobil4.merk = "Honda";
        mobil4.warna = "Merah";
        mobil4.jenis = "sedan";
        mobil4.ccmobil = 1300;
        mobil4.kapasitaspenumpang = 5;
        System.out.println("=====MOBIL 4=====");
        mobil4.InfoMobil();
    }
}
