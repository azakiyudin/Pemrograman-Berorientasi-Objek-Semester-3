package latconstructor;

public class bentuk {
    private String warna; //tanda "-" pada UML artinya private

    public bentuk(String warna) {
        this.warna = warna;
    }

    //Method yg mengembalikan nilai variabel warna
    public String getWarna(){
        return this.warna;
    }

    //method untuk mengubah nilai variabel warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    //method print
    public void printInfo(){
        System.out.println("Bentuk berwarna "+getWarna());
    }
}