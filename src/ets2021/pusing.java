package ets2021;

public class pusing {
    public static void main(String[] args){
        Hewan hewan1 = new kucing();
        System.out.println(hewan1.jumlah);
        hewan1.suara();
        harimau tiger = new harimau();
        System.out.println(tiger.jumlah);
        tiger.suara(tiger);
        Hewan hewan2 = new harimau();
        System.out.println(hewan2.jumlah);
        hewan2.suara();
    }
}
class Hewan{
    int jumlah =0;
    public void suara(){
        System.out.println("----");
    }
}
class kucing extends Hewan{
    int jumlah =10;
    public void info(){
        System.out.println("puzz");
    }
}
class harimau extends Hewan{
    int jumlah =7;
    public void suara(){
        System.out.println("auuuu");
    }
    public void suara(harimau T){
        System.out.println("gukgugk");
    }
}
