package Tugas4;

public class TestSignal {
    public static void main(String[] args){
        /*Desktop aceer = new Desktop();
        RaspberryPi rp = new RaspberryPi();
        Drone dji = new Drone();
        Operator op = new Operator();

        op.wifiControl(aceer);
        op.wifiControl(rp);
        op.wifiControl(dji);
        op.radioControl(rp);
        op.radioControl(dji);*/
        int sum = 0;
        for(int i=1;i<=4;i++){
            for(int j=i+1;j<=10-i;j++){
                sum = sum + (com(10,i)*com(10-i,j));
            }
        }
        System.out.println(sum);

    }
    public static int fact(int n){
        if(n>1){
            return n*fact(n-1);
        } else {
            return 1;
        }
    }
    public static int com(int n, int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
}
