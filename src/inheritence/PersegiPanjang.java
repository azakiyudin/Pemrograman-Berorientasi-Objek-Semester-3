package inheritence;

class tes{
    public static void main(String[] args){
        PersegiPanjang p1 = new PersegiPanjang();
        p1.setPanjang(10);
        p1.setLebar(10);
        p1.isBujursangkar();
        p1.getJenis();
    }
}

public class PersegiPanjang {
    private int panjang, lebar;
    public void setPanjang(int pjg){
        panjang = pjg;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lbr){
        lebar = lbr;
    }

    public int getLebar() {
        return lebar;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public boolean isBujursangkar(){
//        boolean bujursangkar = true;
//        if (panjang == lebar){
//        } else{
//            bujursangkar = false;
//        }
//        return bujursangkar;
        if(panjang == lebar){
            return true;
        } else{
            return false;
        }
    }
    public void getJenis(){
        if(isBujursangkar()){
            System.out.println("bujursangkar");
        } else {
            System.out.println("persegi panjang");
        }
    }
}
