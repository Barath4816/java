package SmartHome;

public class Light extends SmartDevice{
    private int brightnessLevel;
    Light(String DeviceName){
        super(DeviceName);
    }
    public void setBrightness(int level){
        this.brightnessLevel=level;
    }
    public void performFunction(){
        System.out.println("Light "+getDeviceName()+" is adjusting brightness to "+brightnessLevel);
    }
}
