package April_7th_8th_LinkedList;

public class Doubly {
    Node_Doubly head;
    Node_Doubly tail;
    static int count;

    // If you're facing difficulty, trace in notebook and find output.

    public void insert(int data) {
        Node_Doubly node = new Node_Doubly(data);
        if(head==null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
    }

    public void insertAt(int data) {

    }

    public void delete(int pos, int data) {

    }

    public void update(int pos, int data) {
        if(head == null) {
            System.out.println("\nNo data to update!!");
            return;
        }
        if(pos==1) {
            head.data = data;
            return;
        }
        if(pos==count) {
            tail.data = data;
            return;
        }
        Node_Doubly ptr = this.head;
        int currIndex = 1;
        while(ptr!=null) {
            if(currIndex==pos) {
                ptr.data = data;
                return;
            }
            currIndex++;
            ptr = ptr.next;
        }
    }

    public void displayFromFront() {
        if(head == null) {
            System.out.println("List is empty!!");
            return;
        }

        Node_Doubly ptr = this.head;

        System.out.println("\nList Forward: ");
        while(ptr!=null) {
            System.out.println(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public void displayFromBack() {
        if(tail == null) {
            System.out.println("List is empty!!");
            return;
        }

        Node_Doubly ptr = this.tail;

        System.out.println("\nList Backward: ");
        while(ptr!=null) {
            System.out.println(ptr.data + " ");
            ptr = ptr.prev;
        }
    }
}
