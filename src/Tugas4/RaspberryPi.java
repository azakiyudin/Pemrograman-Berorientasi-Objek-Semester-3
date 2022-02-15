package Tugas4;

public class RaspberryPi extends Computer implements WiFi, Radio{
    public int numSocket;

    public void sendData(){
        System.out.println("Controlling raspberry via wifi...");
    }
    public void sendSignal(){
        System.out.println("Controlling raspberry via radio...");
    }
    public void getinfo(){
        System.out.println("ipAddress = " + ipAddress);
        System.out.println("cpuCLock = " + cpuClock);
        System.out.println("memory = " + memory);
        System.out.println("storage = " + storage);
        System.out.println("numSocket = " + numSocket);
    }
}
