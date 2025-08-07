package SmartHome;

public class Main4 {
    public static void main(String[]args){
       Light lLight=new Light("Living Room Light");
       lLight.setBrightness(75);
       Thermostats lThtemp=new Thermostats("Living Room Thermostats");
       lThtemp.setTemperature(22.5);
       Room rom1=new Room("Living Room",lLight,lThtemp);

       Light bLight=new Light("Bedroom Light");
       bLight.setBrightness(60);
       Thermostats bThtemp=new Thermostats("Bedroom Themostats");
       bThtemp.setTemperature(25);
       Room rom2=new Room("Living Room",bLight,bThtemp);

       House home=new House(rom1,rom2);
       home.showAllDevices();
       home.controlAllDevices();

    }
}
