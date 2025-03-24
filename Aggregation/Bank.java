package Aggregation;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 12.22 pm
 *******************************/
public class Bank {
    String bankName;
    Customer cust;

    public Bank(String bankName, Customer cust) {
        this.bankName = bankName;
        this.cust = cust;
    }

    public void display() {
        System.out.println(this.bankName + " " + this.cust.custName);
    }
}
