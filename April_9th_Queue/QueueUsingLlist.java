package April_9th_Queue;

public class UsingLlist {
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

    public void display() {
        if(rear==null)
            System.out.println("\nStack is empty!!");
        else {
            Node ptr = this.front;
            System.out.println("\nElements are: ");
            while (ptr != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
