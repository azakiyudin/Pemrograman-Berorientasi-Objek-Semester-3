package search;

public class linear {
    private String[] allData = new String[]{"A","B","C","D","B","E","F"};
    public void tampilkanData(){
        for (String data : allData){
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public void searching(String karakter){
        int x=0;
        boolean ketemu = false;
        for(int i=x; i< allData.length;i++){
            if(karakter.equals(allData[i])){
                ketemu = true;
                x = i;
                System.out.println("Data pada urutan ke - " + (x+1));
            }
        }
        if(!ketemu) {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}
