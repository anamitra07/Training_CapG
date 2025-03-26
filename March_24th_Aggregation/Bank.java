package March_24th_Aggregation;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 12.22 pm
 *******************************/
public class Bank {
    String bankName;
    Customer_A cust;

    public Bank(String bankName, Customer_A cust) {
        this.bankName = bankName;
        this.cust = cust;
    }

    public void display() {
        System.out.println(this.bankName + " " + this.cust.custName);
    }
}
