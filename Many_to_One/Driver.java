package Many_to_One;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 16.10pm
 *******************************/
public class Driver {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        Customer c1 = new Customer(1,"Rohit", bank);
        Customer c2 = new Customer(2,"Ram", bank);
        Customer c3 = new Customer(3,"Raj", bank);

        c1.display();
        c2.display();
        c3.display();
    }
}
