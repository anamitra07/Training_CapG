package Many_to_One;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 16.07pm
 *******************************/
public class Customer {
    int id;
    String customerName;
    Bank bank;

    public Customer(int id, String customerName, Bank bank) {
        this.id = id;
        this.customerName = customerName;
        this.bank = bank;
    }

    public void display() {
        System.out.println(this.id+" "+this.customerName+" "+this.bank.bankName);
    }
}
