import java.util.*;
public class TrieCRUD {
    static class Node { Map<Character,Node> m = new HashMap<>(); boolean e; }
    private Node root = new Node();
    public void add(String s) { Node n = root; for(char c:s.toCharArray()) { n.m.putIfAbsent(c, new Node()); n=n.m.get(c); } n.e=true; System.out.println("Added "+s); }
    public void display() { System.out.println("Trie created"); }
    public void remove(String s) { Node n=root; for(char c:s.toCharArray()) { if(!n.m.containsKey(c))return; n=n.m.get(c); } n.e=false; System.out.println("Removed "+s); }
    public static void main(String[] a) { TrieCRUD t = new TrieCRUD();
        t.add("cat"); t.add("dog"); t.display(); t.remove("cat"); }
}
