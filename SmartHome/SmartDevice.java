package SmartHome;

abstract class SmartDevice {
    private String DeviceName;
    SmartDevice(String DeviceName){
        this.DeviceName=DeviceName;
    }
    public String getDeviceName(){
        return DeviceName;
    }
  /* public void setDeviceName(String DeviceName){
        this.DeviceName=DeviceName;
    }*/
    abstract void performFunction(); 
}
