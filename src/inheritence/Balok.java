package inheritence;

class main{
    public static void main(String[] args){
        Balok b1 = new Balok();
        b1.setTinggi(10);
        b1.setLebar(100);
        b1.setPanjang(10);
        b1.getLuas();
        b1.getVolume();
        b1.isKubus();
        b1.getJenis();
    }
}

public class Balok extends PersegiPanjang{
    private int Tinggi;

    public void setTinggi(int t){
        Tinggi = t;
    }

    public int getTinggi() {
        return Tinggi;
    }
    public int getLuas(){
        return getPanjang()*getLebar();
    }
    public int getVolume(){
        return Tinggi*getLuas();
    }
    public boolean isKubus(){
        boolean kubus = true;
        if (getPanjang() == Tinggi && getLebar() == Tinggi){
        } else{
            kubus = false;
        }
        return kubus;
    }
    public void getJenis(){
        if(isKubus()) {
            System.out.println("kubus");
        } else {
            System.out.println("balok");
        }
    }
}
