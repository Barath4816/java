package SmartHome;

public class Thermostats extends SmartDevice {
    private double temperature;
    Thermostats(String DeviceName){
        super(DeviceName);
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
    public void performFunction(){
         System.out.println("Thermostat " + getDeviceName() + " is set to " + temperature);
    }
}
