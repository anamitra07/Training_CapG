package March_24th_Aggregation;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 11.40 am
 *******************************/
public class Driver {
    public static void main(String[] args) {
//        Sim sim = new Sim(1234567895);
//        Phone p = new Phone("Iphone", sim);
//        p.display();
//        p=null;
//        System.out.println(sim.phoneNumber);

        Customer_A cust = new Customer_A("Raj");
        Bank b = new Bank("IDBI Bank", cust);
        b.display();
        b=null;
        System.out.println(cust.custName);
    }
}
