import java.util.*;
public class CircularQueueCRUD {
    private Queue<Integer> q = new LinkedList<>();
    public void add(int x) { q.add(x); System.out.println("Added " + x); }
    public void display() { System.out.println("Queue: " + q); }
    public void remove(int x) { if(q.remove((Integer)x)) System.out.println("Removed " + x); }
    public void update(int old, int n) { remove(old); add(n); }
    public static void main(String[] a) { CircularQueueCRUD c = new CircularQueueCRUD();
        c.add(1); c.add(2); c.add(3); c.display(); c.update(2,20); c.display(); }
}
