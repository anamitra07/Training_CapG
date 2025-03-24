package One_to_Many;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 14.15 pm
 *******************************/
public class Customer {
    String customerName;
    int id;

    public Customer(String customerName, int id) {
        this.customerName = customerName;
        this.id = id;
    }

    public String customerName() {
        return customerName;
    }
}
