import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        // HashMap
        Map<String, String> students = new HashMap<>();
        students.put("101", "Alice");
        students.put("102", "Bob");
        students.put("103", "Charlie");
        
        System.out.println("HashMap: " + students);
        System.out.println("Value for 101: " + students.get("101"));
        System.out.println("Contains key 102: " + students.containsKey("102"));
        
        // Iterate over HashMap
        System.out.println("\nIterating HashMap:");
        for(Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // LinkedHashMap (maintains insertion order)
        Map<Integer, String> linked = new LinkedHashMap<>();
        linked.put(3, "Three");
        linked.put(1, "One");
        linked.put(2, "Two");
        System.out.println("\nLinkedHashMap: " + linked);
        
        // TreeMap (sorted by keys)
        Map<Integer, String> tree = new TreeMap<>();
        tree.put(3, "Three");
        tree.put(1, "One");
        tree.put(2, "Two");
        System.out.println("TreeMap: " + tree);
    }
}
