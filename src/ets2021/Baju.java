package ets2021;

public class Baju {
    private String merk;
    private static String butik;
    protected Baju(){
        merk = null;
    }
    protected Baju(String merk){
        this.merk = merk;
    }
    protected void setMerk(String merk){
        this.merk = merk;
    }
    protected String getMerk(){
        return merk;
    }
    protected static void setButik(String butik){
        Baju.butik = butik;
    }
    protected static String getButik(){
        return Baju.butik;
    }
    protected void tampil(String a){
        System.out.println(a);
    }
}
