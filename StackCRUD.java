public class StackCRUD {
    private int[] stack;
    private int top;
    private static final int MAX_SIZE = 100;

    public StackCRUD() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

    // CREATE - Push element
    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stack[++top] = value;
            System.out.println("Pushed " + value);
        } else {
            System.out.println("Stack overflow!");
        }
    }

    // READ - Peek top element
    public int peek() {
        if (top >= 0) {
            System.out.println("Top element: " + stack[top]);
            return stack[top];
        }
        System.out.println("Stack is empty");
        return -1;
    }

    // READ - Display all elements
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // UPDATE - Update element at position
    public void update(int position, int newValue) {
        if (position >= 0 && position <= top) {
            stack[position] = newValue;
            System.out.println("Updated position " + position + " to " + newValue);
        } else {
            System.out.println("Invalid position");
        }
    }

    // DELETE - Pop element
    public int pop() {
        if (top >= 0) {
            int value = stack[top--];
            System.out.println("Popped " + value);
            return value;
        }
        System.out.println("Stack underflow!");
        return -1;
    }

    // Check if empty
    public boolean isEmpty() {
        return top < 0;
    }

    // Get size
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackCRUD stack = new StackCRUD();

        System.out.println("=== Stack CRUD Operations ===");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();

        stack.update(1, 25);
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();
    }
}
