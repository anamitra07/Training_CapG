package One_to_Many;

/******************************
 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 13.59 pm
 *******************************/

public class Bank {
    Customer[] customers;
    String bankName;
    static int count = 0;

    public Bank(int size, String bankName) {
        this.customers = new Customer[size];
        this.bankName = bankName;
    }

    public void addCustomer(Customer customer) {
        if(count<customers.length) {
            customers[count++] = customer;
            System.out.println("Customer added");
        }
        else {
            System.out.println("Cannot add customer");
        }
    }

    public void fetchDetailsByID(int id) {
        for(int i=0;i<count;i++) {
            if(this.customers[i].id==id) {
                System.out.println(customers[i].customerName);
            }
        }
    }

    public void displayCustomers() {
        for(int i=0;i<count;i++) {
            System.out.println(customers[i].id + ":"+this.customers[i].customerName);
        }
    }


}
