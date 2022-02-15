package ets2021;

public class MainBaju2 {
    public static void main(String arg[]){
        String butik = "PBO";
        String merk = "Sakagram";
        String warna = "Maron";
        Baju.setButik(butik);

        Kaos obj = new Kaos(merk,warna);
        obj.tampil("Merk Kaos=" +obj.getMerk());
        obj.tampil("Warna Kaos=" + obj.getWarna());
        obj.tampil("Nama Butik=" + obj.getButik());
    }
}
