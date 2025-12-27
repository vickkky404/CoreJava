public class QueueCRUD {
    private int[] queue;
    private int front;
    private int rear;
    private static final int MAX_SIZE = 100;

    public QueueCRUD() {
        queue = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    // CREATE - Enqueue (add to rear)
    public void enqueue(int value) {
        if (rear < MAX_SIZE - 1) {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println("Enqueued " + value);
        } else {
            System.out.println("Queue is full!");
        }
    }

    // READ - Peek front element
    public int peek() {
        if (front >= 0 && front <= rear) {
            System.out.println("Front element: " + queue[front]);
            return queue[front];
        }
        System.out.println("Queue is empty");
        return -1;
    }

    // READ - Display all elements
    public void display() {
        if (front < 0 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // UPDATE - Update element at position
    public void update(int position, int newValue) {
        if (position >= front && position <= rear) {
            queue[position] = newValue;
            System.out.println("Updated position " + position + " to " + newValue);
        } else {
            System.out.println("Invalid position");
        }
    }

    // DELETE - Dequeue (remove from front)
    public int dequeue() {
        if (front >= 0 && front <= rear) {
            int value = queue[front++];
            if (front > rear) {
                front = rear = -1;
            }
            System.out.println("Dequeued " + value);
            return value;
        }
        System.out.println("Queue underflow!");
        return -1;
    }

    // Check if empty
    public boolean isEmpty() {
        return front < 0;
    }

    // Get size
    public int size() {
        return (front < 0) ? 0 : (rear - front + 1);
    }

    public static void main(String[] args) {
        QueueCRUD queue = new QueueCRUD();

        System.out.println("=== Queue CRUD Operations ===");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.peek();

        queue.update(0, 15);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.display();
    }
}
