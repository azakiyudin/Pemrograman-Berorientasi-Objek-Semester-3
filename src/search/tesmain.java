package search;

import java.util.Scanner;

public class tesmain {
    public static void main (String[] args){
        /*linear test = new linear();
        test.searching("B");
        test.tampilkanData();
        int list[] = new int[]{1,2,3,4,13,14,17,24,46};*/
        Scanner input = new Scanner(System.in);
        int bilangan, pembagi;
        try {
            System.out.print("Masukkan bilangan : ");
            bilangan = input.nextInt();
            System.out.print("Masukkan pembagi : ");
            pembagi = input.nextInt();
            System.out.println(bilangan + "/" + pembagi + " = " + bilangan/pembagi);
        }
        finally {
            System.out.println("Terima kasih");
        }
    }
}
