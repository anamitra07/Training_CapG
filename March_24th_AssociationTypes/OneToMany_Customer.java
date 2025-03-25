package March_24th_AssociationTypes;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 14.15 pm
 *******************************/
public class OneToMany_Customer {
    String customerName;
    int id;

    public OneToMany_Customer(String customerName, int id) {
        this.customerName = customerName;
        this.id = id;
    }

    public String customerName() {
        return customerName;
    }
}
