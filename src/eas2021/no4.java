package eas2021;
import java.io.*;
public class no4 extends Exception{
        private int a;
        no4(int b){
            a = b;
        }
        public String toString(){
            return "MyException [" + a + "]";
        }
}
class UserdefException{
    public int x;
    final int k=5;
    void getInt(){
        try{
            BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukkan bilbul");
            String line;
            while((line = d.readLine()) != null){
                x = Integer.parseInt(line);
                if(x==5){
                    System.out.println("Menghasilkan exception");
                    throw new no4(x);
                } else {
                    System.out.println("keliru coba lagi");
                    continue;
                }
            }
        }
        catch (no4 m){
            System.out.println("Exception hasil " +m);
        }
        catch (NumberFormatException n){
            System.out.println("bukan karakter");
            System.out.println("exception " + n);
        }
        catch (IOException e){

        }
    }
    public static void main(String a[]){
        UserdefException u = new UserdefException();
        u.getInt();
    }
}
