package April_9th_Stack;

import java.util.Scanner;

public class Driver_StackUsingLlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingLlist stack = new StackUsingLlist();
        boolean flag = true;
        while(flag) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Check isEmpty\n6. Exit");
            System.out.print("\nEnter your choice: ");
            int ch = sc.nextInt();
            switch(ch) {
                case 1: {
                    System.out.print("\nEnter element to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                }
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    stack.isEmpty();
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
