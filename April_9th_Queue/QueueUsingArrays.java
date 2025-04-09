package April_9th_Queue;

public class QueueUsingArrays {
    static int front=-1;
    static int rear=-1;
    int size;
    int[] queue;

    public QueueUsingArrays(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    public void enqueue(int data) {
        if(rear==size-1)
            System.out.println("Queue is full!!");
        else
            queue[++rear] = data;
    }

    public void pop() {
        if(front==rear)
            System.out.println("\nQueue is empty!!");
        else {
            for(int i=0;i<rear;i++) {
                queue[i] = queue[i + 1];
            }
            System.out.println("\nValue popped");
            rear--;
        }
    }

    public void peek() {
        if(front==rear)
            System.out.println("\nQueue is empty!!");
        else
            System.out.println("\nValue at the front: "+queue[front+1]);
    }

    public void isEmpty() {
        if(front==rear)
            System.out.println("\nQueue is empty!!");
        else
            System.out.println("\nQueue is not empty!!");
    }

    public void display() {
        if(front==rear)
            System.out.println("\nQueue is empty!!");
        else {
            System.out.println("\nElements in queue are: ");
            for (int i = front+1; i < rear+1; i++)
                System.out.print(queue[i] + " ");
        }
    }
}
