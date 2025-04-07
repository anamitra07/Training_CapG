package LinkedList;

import java.util.Scanner;

public class Driver {
    static int pos, val;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Singly_Llist list = new Singly_Llist();
        boolean flag = true;
        while(flag) {
            System.out.println("\n1. Insert data\n2. Update data\n3. Insert at a specific position\n4. Delete from a specific position\n5. Display data\n6. Exit");
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
                    System.out.print("\nEnter position: ");
                    pos = sc.nextInt();
                    System.out.print("\nEnter value: ");
                    val = sc.nextInt();
                    list.update(pos, val);
                    break;
                }
                case 3: {
                    System.out.print("\nEnter position to insert: ");
                    pos = sc.nextInt();
                    System.out.print("\nEnter value to insert: ");
                    val = sc.nextInt();
                    list.insert_at_position(pos, val);
                    break;
                }
                case 4: {
                    System.out.print("\nEnter position to delete from: ");
                    pos = sc.nextInt();
                    list.delete(pos);
                    break;
                }
                case 5:
                    list.display();
                    break;

                case 6:
                    flag = false;
                    break;

                default:
                    System.err.println("\nInvalid choice!!");
            }
        }
    }
}
