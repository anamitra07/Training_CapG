package April_7th_8th_LinkedList;

import java.util.Scanner;

public class Driver_Circular {
    static int pos, val;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circular list = new Circular();
        boolean flag = true;
        while(flag) {
            System.out.println("\n1. Insert data\n2. Insert at a specific position\n3. Delete from a specific position\n4. Update data\n5. Display data\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("\nEnter the data: ");
                    int data = sc.nextInt();
                    list.insert(data);
                    break;
                }
                case 2: {
                    System.out.print("\nEnter position to insert: ");
                    pos = sc.nextInt();
                    System.out.print("\nEnter value to insert: ");
                    val = sc.nextInt();
                    list.insertAt(pos, val);
                    break;
                }
                case 3: {
                    System.out.print("\nEnter position to delete from: ");
                    pos = sc.nextInt();
                    list.delete(pos);
                    break;
                }
                case 4: {
                    System.out.print("\nEnter position: ");
                    pos = sc.nextInt();
                    System.out.print("\nEnter value: ");
                    val = sc.nextInt();
                    list.update(pos, val);
                    break;
                }
                case 5:
                    list.display();
                    break;

                case 6:
                    flag = false;
                    break;

                default:
                    System.err.println("\nEnter a valid choice!!");
            }
        }
    }
}
