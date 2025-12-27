import java.util.*;
public class DequeCRUD {
    private Deque<Integer> dq = new LinkedList<>();
    public void addFront(int x) { dq.addFirst(x); System.out.println("Added front "+x); }
    public void addBack(int x) { dq.addLast(x); System.out.println("Added back "+x); }
    public void display() { System.out.println("Deque: "+dq); }
    public void removeFront() { if(!dq.isEmpty()) System.out.println("Removed "+dq.removeFirst()); }
    public void removeBack() { if(!dq.isEmpty()) System.out.println("Removed "+dq.removeLast()); }
    public static void main(String[] a) { DequeCRUD d = new DequeCRUD();
        d.addFront(1); d.addBack(2); d.addFront(0); d.display(); d.removeFront(); d.removeBack(); d.display(); }
}
