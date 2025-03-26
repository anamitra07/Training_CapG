package March_26th_Hierarchical_Inheritance;

public class Driver {
    public static void main(String[] args) {
        Bike b = new Bike("AB","Hero","Splendor",1000,true,true);
        b.displayDetails();

        Car c = new Car("AB","Honda","City",10000,true,4);
        c.displayDetails();
    }
}
