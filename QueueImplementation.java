import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Queue Implementation Demo");
        System.out.println("=".repeat(30));
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue after adding 10, 20, 30, 40, 50: " + queue);
        System.out.println("Peek (front element): " + queue.peek());
        System.out.println("Poll (remove front): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("\nRemoving all elements:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}
