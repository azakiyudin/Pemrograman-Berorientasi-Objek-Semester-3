package eas2021;

public class CariData {
    private final int[] data ={5,30,12,15,27,13,27,48,42,15,24,58,15};
    public void tampilkanData(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public int PosisiX(int X){
        int posisi=-1;
        for(int i=0;i<data.length;i++){
            if(X == data[i]){
                posisi = i;
            }
        }
        return posisi;
    }
    public int[] dataX(int[] data){
        return data;
    }
    public void median(int[] arr){
        int[] array = dataX(arr);

    }
    public int JumlahX(int X){
        int jumx=0;
        for(int i=0;i<data.length;i++){
            if(X == data[i]){
                jumx++;
            }
        }
        return jumx;
    }
}
