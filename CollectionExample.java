import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("ArrayList: " + list);
        
        // HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("HashSet: " + set);
        
        // HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        System.out.println("HashMap: " + map);
        
        // LinkedList
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
    }
}
