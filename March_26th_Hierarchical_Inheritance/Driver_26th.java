package March_26th_Hierarchical_Inheritance;

public class Driver_26th {
    public static void main(String[] args) {
        Bike_26th b = new Bike_26th("AB","Hero","Splendor",1000,true,true);
        b.displayDetails();

        Car_26th c = new Car_26th("AB","Honda","City",10000,true,4);
        c.displayDetails();
    }
}
