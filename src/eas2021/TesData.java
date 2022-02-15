package eas2021;

public class TesData {
    public static void main(String[] args){
        CariData data = new CariData();
        data.tampilkanData();
        System.out.println("Data 15 posisi " + data.PosisiX(15));
        System.out.println("Data 15 sebanyak " + data.JumlahX(15));
    }
}
