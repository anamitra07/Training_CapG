package LinkedList;

public class Singly_Llist {
    Node head;
    Node tail;
    static int count;

    public void insert(int data) {

        // creating a node object;
        Node node = new Node(data);

        // for first node object
        if(head==null) {
            head = node;
            tail = node;
            count++;
        }

        // for every next node object
        else {
            tail.next = node;
            tail = node;
            count++;
        }
    }

    public void insert_at_position(int pos, int value) {

        // checking if position is within the size or not
        if(pos<1 || pos>count+1)
            System.err.println("\nInvalid position for insertion.");
        else {
            // creating a new node, named node.
            Node node = new Node(value);

            // creating a pointer object to traverse through the linked list.
            Node ptr = this.head;

            // checking if any element is present in the list or not
            if(head==null) {
                head = node;
                tail = node;
                count++;
                return;
            }

            // if the node is inserted at position 1, its next part will point to head
            if (pos == 1) {
                node.next = head;
                head = node;
            }
            else {
                // for any other case
                int currIndex = 1;
                while (ptr != null && currIndex < pos - 1) {
                    ptr = ptr.next;
                    currIndex++;
                }

                node.next = ptr.next;
                ptr.next = node;
            }
        }
    }

    public void update(int pos,int value) {

        // creating a pointer 'ptr' for traversing through the list
        Node ptr = this.head;
        if(pos>count)
            System.err.println("\nNo data present at specified position.");
        else {
            for(int currIndex = 1 ; currIndex <= count ; currIndex++) {
                if (currIndex == pos)
                    ptr.data = value;
                ptr = ptr.next;
            }
        }
    }

    public void delete(int pos) {

        if(pos<1 || pos>count) {
            System.err.println("\nNo data present!!");
        }

        // creating a pointer 'ptr' for traversing through the list
        Node ptr = this.head;

        int currIndex=1;
        if(pos==1) {
            ptr = ptr.next;
            head = ptr;
            return;
        }

        while(ptr!=null && currIndex<pos-1) {
            ptr = ptr.next;
            currIndex++;
        }
        ptr.next = ptr.next.next;
    }

    public void display() {
        Node ptr = this.head;
        if(ptr!=null) {
            System.out.print("\nElements are: ");
            while (ptr != null) {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
        }
        else
            System.err.println("\nNo data present");
    }
}
