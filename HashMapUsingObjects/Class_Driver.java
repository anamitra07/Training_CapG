package HashMapUsingObjects;

import java.util.Scanner;

public class Class_Driver<K,V> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap_Objects<Object, Object> hashmap = new HashMap_Objects<>();
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
                    Object putKey = sc.next();
                    System.out.print("Enter value: ");
                    Object putValue = sc.next();
                    hashmap.put(putKey, putValue);
                    System.out.println("Key-Value pair inserted/updated.");
                    break;
                }

                case 2: {
                    System.out.print("Enter key: ");
                    Object getKey = sc.next();
                    try {
                        Object value = hashmap.get(getKey);
                        System.out.println("Value for key " + getKey + ": " + value);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

//                case 3: {
//                    System.out.print("Enter key: ");
//                    Object removeKey = sc.nextInt();
//                    hashmap.remove(removeKey);
//                    break;
//                }
//
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
