import java.util.*;
public class PriorityQueueCRUD {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    public void add(int x) { pq.add(x); System.out.println("Added "+x); }
    public void display() { System.out.println("PQ: "+pq); }
    public void remove() { if(!pq.isEmpty()) System.out.println("Removed "+pq.poll()); }
    public void update(int old, int n) { pq.remove((Integer)old); add(n); }
    public static void main(String[] a) { PriorityQueueCRUD p = new PriorityQueueCRUD();
        p.add(5); p.add(2); p.add(8); p.display(); p.remove(); p.display(); }
}
