package ets2021;

public class MainBaju1 {
    public static void main(String arg[]){

        String butik = "PBO";
        String merk = "Sakagram";
        Baju.setButik(butik);
        Baju obj = new Baju(merk);
        obj.tampil("Merk Baju=" +obj.getMerk());
        obj.tampil("Nama Butik=" +obj.getButik());
        System.out.println("=======");
    }
}
