package March_24th_AssociationTypes;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 16.07pm
 *******************************/
public class ManyToOne_Customer {
    int id;
    String customerName;
    ManyToOne_Bank bank;

    public ManyToOne_Customer(int id, String customerName, ManyToOne_Bank bank) {
        this.id = id;
        this.customerName = customerName;
        this.bank = bank;
    }

    public void display() {
        System.out.println(this.id+" "+this.customerName+" "+this.bank.bankName);
    }
}
