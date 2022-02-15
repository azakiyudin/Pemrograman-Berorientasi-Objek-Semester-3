package Tugas4;

public class Desktop extends Computer implements WiFi{
    public int battCapacity;
    public void getinfo(){
        System.out.println("ipAddress = " + ipAddress);
        System.out.println("cpuCLock = " + cpuClock);
        System.out.println("memory = " + memory);
        System.out.println("storage = " + storage);
        System.out.println("battCapacity = " + battCapacity);
    }
    public void sendData(){
        System.out.println("Controlling dekstop via wifi...");
    }
}
