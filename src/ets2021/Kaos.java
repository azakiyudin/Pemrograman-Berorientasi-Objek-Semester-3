package ets2021;

public class Kaos extends Baju{
    private String warna;
    protected Kaos(String merk, String warna){
        super(merk);
        this.warna = warna;
    }
    protected String getWarna(){
        return warna;
    }
}
