package April_9th_Stack;

public class StackUsingLlist {
    Node head;
    Node tail;
    static int top=-1;

    public void push(int data) {
        Node node = new Node(data);
        if(head==null) {
            head = node;
            tail = node;
            top++;
        }
        else {
            tail.next = node;
            tail = node;
            top++;
        }
    }

    public void pop() {
        if(head==null)
            System.out.println("\nStack is empty!!");
        else if(head.next==null) {
            head = null;
            top--;
        }
        else {
            Node ptr = this.head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
            tail = ptr;
            top--;
        }
    }

    public void peek() {
        if(head==null)
            System.out.println("\nStack is empty!!");
        else
            System.out.println("\nElement at top is: "+tail.data);
    }

    public void isEmpty() {
        if(head==null)
            System.out.println("\nStack is empty!!");
        else
            System.out.println("\nStack is not empty!!");
    }

    public void display() {
        if(head==null)
            System.out.println("\nStack is empty!!");
        else {
            Node ptr = this.head;
            System.out.println("\nElements are: ");
            while (ptr != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
