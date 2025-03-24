package One_to_Many;
import java.util.Scanner;

/******************************
 Created by: Anamitra Kanjilal
 Date: 24.03.25
 Time: 14.07 pm
 *******************************/

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        Bank bank = new Bank(size,"SBI");
        boolean flag = true;
        while(flag) {
            System.out.println("1. Insert Customer\n2. Update details\n3. Remove Customer \n4. Fetch Customer by ID \n5. Display Details\n6. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter customer ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter customer name: ");
                    String name = sc.nextLine();
                    Customer customer = new Customer(name, id);
                    bank.addCustomer(customer);
                    break;
//                case 2:
//                    bank.updateCustomer();
//                    break;
//                case 3:
//                    sc.nextLine();
//                    System.out.println("Enter customer to remove: ");
//                    String name = sc.nextLine();
//                    Customer
//                    bank.removeCustomer()
//                    break;
                case 4:
                    System.out.println("\nEnter ID: ");
                    id = sc.nextInt();
                    bank.fetchDetailsByID(id);
                    break;
                case 5:
                    bank.displayCustomers();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
        sc.close();
    }
}
