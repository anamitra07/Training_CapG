package April_7th_8th_LinkedList;

public class Circular {
    Node head;
    Node tail;
    static int count;

    public void insert(int data) {
        Node node = new Node(data);

        if(head==null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        count++;
    }

    public void insertAt(int pos, int data) {
        if(pos<=0 || pos>count) {
            System.out.println("Invalid position for insertion!!");
            return;
        }

        Node node = new Node(data);
        Node ptr = this.head;

        if(head==null) {
            head = node;
            tail = node;;
            return;
        }

        if(pos==1) {
            node.next = head;
            head = node;
            tail.next = head;
        }

        else {
            int currIndex = 1;
            while(currIndex<pos-1) {
                ptr = ptr.next;
                currIndex++;
            }
            node.next = ptr.next;
            ptr.next = node;

            if(node.next==head)
                tail = node;
        }
        count++;
    }

    public void delete(int pos) {
        if(head==null)
            System.out.println("List is empty!! Insert elements first!!");
        else if(pos<=0 || pos>count)
            System.out.println("Please, Enter a valid position!!");
        else {
            if(pos==1) {
                Node temp = head;
                head = head.next;
                tail.next = head;
                temp.next = null;
            }
            else if(pos==count) {
                Node ptr = this.head;
                for (int currIndex = 1; currIndex < pos - 1; currIndex++) {
                    ptr = ptr.next;
                }
                ptr.next = head;
                tail = ptr;
            }
            else {
                Node ptr = this.head;
                for (int currIndex = 1; currIndex < pos - 1; currIndex++) {
                    ptr = ptr.next;
                }
                Node temp = ptr.next;
                ptr.next = ptr.next.next;
                temp.next = null;
            }
            count--;
        }
    }

    public void update(int pos, int value) {
        if(head==null)
            System.out.println("List is empty!! Insert elements first!!");
        else if(pos<=0 || pos>count)
            System.out.println("Enter a valid position!!");
        else {
            Node ptr = this.head;
            for(int currIndex = 1; currIndex < pos; currIndex++) {
                ptr = ptr.next;
            }
            ptr.data = value;
            System.out.println("Value updated!!");
        }
    }

    public void display() {
        if(head==null) {
            System.err.println("No element present!!");
            return;
        }
        else
        {
            Node ptr = this.head;
            System.out.print("\nElements in the list are: ");
            do {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            } while(ptr!=head);
        }
    }
}
