package March_24th_AssociationTypes;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 16.10pm
 *******************************/
public class ManyToOne_Driver {
    public static void main(String[] args) {
        ManyToOne_Bank bank = new ManyToOne_Bank("SBI");

        ManyToOne_Customer c1 = new ManyToOne_Customer(1,"Rohit", bank);
        ManyToOne_Customer c2 = new ManyToOne_Customer(2,"Ram", bank);
        ManyToOne_Customer c3 = new ManyToOne_Customer(3,"Raj", bank);

        c1.display();
        c2.display();
        c3.display();
    }
}
