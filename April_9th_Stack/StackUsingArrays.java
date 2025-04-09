package April_9th_Stack;

public class StackUsingArrays {

    static int top = -1;
    int[] stack;
    int size;

    public StackUsingArrays(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    public void push(int data) {
        if(top==size-1)
            System.out.println("\nStack overflow");
        else
            stack[++top] = data;
    }

    public void pop() {
        if(top==-1)
            System.out.println("\nStack is empty!!");
        else {
            int popValue = stack[top--];
            System.out.println("Popped value is: "+popValue);
        }
    }

    public void peek() {
        if(top==-1)
            System.out.println("\nStack is empty!!");
        else
            System.out.println("Element at the top of stack is: "+stack[top]);
    }

    public void display() {
        if(top==-1)
            System.out.println("\nStack is empty!!");
        else {
            System.out.println("\nElements is stack are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public void isEmpty() {
        if(top==-1)
            System.out.println("\nStack is empty!!");
        else
            System.out.println("\nStack is not empty!!");
    }

}
