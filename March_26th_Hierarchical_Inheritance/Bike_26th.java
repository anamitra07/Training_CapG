package March_26th_Hierarchical_Inheritance;

public class Bike_26th extends Vehicle_26th{
    private boolean hasGear;
    public Bike_26th(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, boolean hasGear) {
        super(vehicleNumber,brand,model,rentalPricePerDay,isAvailable);
        this.hasGear = hasGear;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(" "+this.hasGear);
        super.rentvehicle();
    }
}
