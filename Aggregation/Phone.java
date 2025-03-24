package Aggregation;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 11.31 am
 *******************************/
public class Phone {
    String name;
    Sim sim;

    public Phone(String name, Sim sim) {
        this.name = name;
        this.sim = sim;
    }

    public void display() {
        System.out.println(this.name + "  " + this.sim.phoneNumber);
    }
}
