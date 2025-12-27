import java.util.*;

public class HeapCRUD {
    private PriorityQueue<Integer> minHeap;

    public HeapCRUD() {
        minHeap = new PriorityQueue<>();
    }

    // CREATE - Insert
    public void insert(int value) {
        minHeap.add(value);
        System.out.println("Inserted " + value);
    }

    // READ - Peek minimum
    public int peek() {
        if (!minHeap.isEmpty()) {
            int min = minHeap.peek();
            System.out.println("Min element: " + min);
            return min;
        }
        System.out.println("Heap is empty");
        return -1;
    }

    // READ - Display
    public void display() {
        System.out.println("Heap: " + minHeap);
    }

    // UPDATE - Extract and reinsert
    public void update(int oldValue, int newValue) {
        if (minHeap.remove(oldValue)) {
            minHeap.add(newValue);
            System.out.println("Updated " + oldValue + " to " + newValue);
        }
    }

    // DELETE - Extract minimum
    public int extractMin() {
        if (!minHeap.isEmpty()) {
            int min = minHeap.poll();
            System.out.println("Extracted " + min);
            return min;
        }
        System.out.println("Heap is empty");
        return -1;
    }

    public int size() {
        return minHeap.size();
    }

    public static void main(String[] args) {
        HeapCRUD heap = new HeapCRUD();
        heap.insert(50);
        heap.insert(30);
        heap.insert(20);
        heap.insert(15);
        heap.display();
        heap.peek();
        heap.update(20, 10);
        heap.display();
        heap.extractMin();
        heap.display();
    }
}
