package April_9th_Queue;

import java.util.Scanner;

public class Driver_QueueUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter size of queue: ");
        int size = sc.nextInt();
        QueueUsingArrays queue = new QueueUsingArrays(size);
        boolean flag = true;
        while(flag) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Check isEmpty\n6. Exit");
            System.out.print("\nEnter your choice: ");
            int ch = sc.nextInt();
            switch(ch) {
                case 1: {
                    System.out.print("\nEnter element to enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                }
                case 2:
                    queue.pop();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    queue.isEmpty();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}
