import java.util.*;

public class HashMapCRUD {
    private HashMap<Integer, String> map;

    public HashMapCRUD() {
        map = new HashMap<>();
    }

    // CREATE - Add key-value pair
    public void put(int key, String value) {
        map.put(key, value);
        System.out.println("Added " + key + " -> " + value);
    }

    // READ - Get value by key
    public String get(int key) {
        String value = map.get(key);
        if (value != null) {
            System.out.println("Value at " + key + ": " + value);
            return value;
        }
        System.out.println("Key not found");
        return null;
    }

    // READ - Display all
    public void display() {
        System.out.println("HashMap: " + map);
    }

    // UPDATE - Update value
    public void update(int key, String newValue) {
        if (map.containsKey(key)) {
            map.put(key, newValue);
            System.out.println("Updated " + key + " to " + newValue);
        }
    }

    // DELETE - Remove by key
    public void remove(int key) {
        if (map.remove(key) != null) {
            System.out.println("Removed key " + key);
        }
    }

    // Check if key exists
    public boolean containsKey(int key) {
        return map.containsKey(key);
    }

    public static void main(String[] args) {
        HashMapCRUD crud = new HashMapCRUD();
        crud.put(1, "Alice");
        crud.put(2, "Bob");
        crud.put(3, "Charlie");
        crud.display();
        crud.get(2);
        crud.update(2, "Robert");
        crud.display();
        crud.remove(1);
        crud.display();
    }
}
