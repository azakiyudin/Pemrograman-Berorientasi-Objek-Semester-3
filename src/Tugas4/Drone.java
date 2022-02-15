package Tugas4;

public class Drone implements WiFi,Radio {
    public int maxSpeed,maxAltitude;
    public void sendData(){
        System.out.println("Controlling drone via wifi...");
    }

    public void sendSignal() {
        System.out.println("Controlling drone via radio...");
    }
}
