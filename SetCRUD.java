import java.util.*;
public class SetCRUD {
    private Set<Integer> s = new HashSet<>();
    public void add(int x) { if(s.add(x)) System.out.println("Added "+x); }
    public void display() { System.out.println("Set: "+s); }
    public void remove(int x) { if(s.remove(x)) System.out.println("Removed "+x); }
    public void update(int old, int n) { remove(old); add(n); }
    public static void main(String[] a) { SetCRUD c = new SetCRUD();
        c.add(1); c.add(2); c.add(3); c.display(); c.update(2,20); c.display(); }
}
