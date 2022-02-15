package modul2;

public class tesPelajar {
    public static void main(String[] args){
        Pelajar p1 = new Pelajar();
        p1.nama = "zaki";
        p1.nip = "1232";
        p1.nilaiUjian1 = 90;
        p1.nilaiUjian2 = 80;
        p1.nilaiTugas = 96;
        p1.nilaiAkhir();
        p1.isLulus();
        p1.status();


        Pelajar p2 = new Pelajar();
        p2.nama = "zaki";
        p2.nip = "1232";
        p2.nilaiUjian1 = 50;
        p2.nilaiUjian2 = 40;
        p2.nilaiTugas = 30;
        p2.nilaiAkhir();
        p2.isLulus();
        p2.status();
    }
}
