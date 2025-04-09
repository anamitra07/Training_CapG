package April_9th_Queue;

public class QueueUsingLlist {
    Node front;
    Node rear;
    static int count;

    public void enqueue(int data) {
        Node node = new Node(data);
        if(front==null) {
            front = node;
            rear = node;
            count++;
        }
        else {
            rear.next = node;
            rear = node;
            count++;
        }
    }

    public void peek() {
        if(front==null)
            System.out.println("\nQueue is empty!!");
        else
            System.out.println("Element at the front is: "+front.data);
    }

    public void display() {
        if(rear==null)
            System.out.println("\nQueue is empty!!");
        else {
            Node ptr = this.front;
            System.out.println("\nElements are: ");
            while (ptr != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }

    public void isEmpty() {
        if(front==null)
            System.out.println("\nQueue is empty!!");
        else
            System.out.println("\nQueue is not empty!!");
    }
}
