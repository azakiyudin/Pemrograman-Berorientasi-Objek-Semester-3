package modul2;

public class Pelajar {
    String nip, nama;
    double nilaiUjian1, nilaiUjian2, nilaiTugas;
    private double nilai;
    private String lulus;

    public double nilaiAkhir(){
        this.nilai = 40*this.nilaiUjian1/100 + 40*this.nilaiUjian2/100 + 20*this.nilaiTugas/100;
        return this.nilai;
    }
    public String isLulus(){
        if (this.nilai >= 60){
           return this.lulus = "LULUS";
        } else {
            return this.lulus = "TIDAK LULUS";
        }
    }
    public void status(){
        System.out.println("Nama pelajar = " + this.nama);
        System.out.println("NIP = " + this.nip);
        System.out.println("Nilai akhir = " + this.nilai);
        System.out.println("Status = " + this.lulus);
        System.out.println();
    }
}
