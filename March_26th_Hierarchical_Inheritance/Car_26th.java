package March_26th_Hierarchical_Inheritance;

public class Car_26th extends Vehicle_26th{
    private int numberOfDoors;
    public Car_26th(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors) {
        super(vehicleNumber,brand,model,rentalPricePerDay,isAvailable);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(" "+this.numberOfDoors);
        super.rentvehicle();
    }
}
