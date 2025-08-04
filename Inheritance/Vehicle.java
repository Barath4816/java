package Inheritance;
abstract class Vehicle {
    private String vehicleType;
    private String brand;
    String model;
    public String getVehicleType() {
        return vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract void start();
    abstract void stop();
   

    Vehicle(String vehicleType, String brand, String model) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
    }

}