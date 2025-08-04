package Inheritance;
public class Car extends Vehicle {
   private String fuelType;
    private String transmission;
   private int numberOfDoors;

   
    public String getFuelType() {
    return fuelType;
}


   public String getTransmission() {
    return transmission;
   }


   public int getNumberOfDoors() {
    return numberOfDoors;
   }
   public void start(){
    System.out.println("start with key");
   }
   public void stop(){
    System.out.println("apply brake");
   }
 

    Car(String vehicleType, String brand, String model,
        String fuelType, String transmission, int numberOfDoors) {
        super(vehicleType, brand, model);
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.numberOfDoors = numberOfDoors;
    }

}