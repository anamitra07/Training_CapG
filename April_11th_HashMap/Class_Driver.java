package April_11th_HashMap;

import java.util.Scanner;

public class Class_Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMapClass hashmap = new HashMapClass();
        boolean flag = true;

        while (flag) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert/Update a key-value pair");
            System.out.println("2. Get a value by key");
            System.out.println("3. Delete a key-value pair");
            System.out.println("4. Display all key-value pairs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter key: ");
                    int putKey = sc.nextInt();
                    System.out.print("Enter value: ");
                    int putValue = sc.nextInt();
                    hashmap.put(putKey, putValue);
                    System.out.println("Key-Value pair inserted/updated.");
                    break;
                }

                case 2: {
                    System.out.print("Enter key: ");
                    int getKey = sc.nextInt();
                    try {
                        int value = hashmap.get(getKey);
                        System.out.println("Value for key " + getKey + ": " + value);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter key: ");
                    int removeKey = sc.nextInt();
                    hashmap.remove(removeKey);
                    System.out.println("Key-Value pair removed.");
                    break;
                }

                case 4:
                    hashmap.display();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
