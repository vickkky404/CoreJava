// Java Program

public class ArrayCRUD {
    private static final int MAX_SIZE = 100;
    private int[] array = new int[MAX_SIZE];
    private int size = 0;

    // CREATE - Add element at end
    public void add(int value) {
        if (size < MAX_SIZE) {
            array[size++] = value;
            System.out.println("Added " + value + " at index " + (size - 1));
        } else {
            System.out.println("Array is full!");
        }
    }

    // CREATE - Insert element at specific position
    public void insertAt(int index, int value) {
        if (index < 0 || index > size || size >= MAX_SIZE) {
            System.out.println("Invalid index or array is full");
            return;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
        System.out.println("Inserted " + value + " at index " + index);
    }

    // READ - Get element at specific position
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        System.out.println("Invalid index");
        return -1;
    }

    // READ - Display all elements
    public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // UPDATE - Update element at specific position
    public void update(int index, int newValue) {
        if (index >= 0 && index < size) {
            array[index] = newValue;
            System.out.println("Updated index " + index + " to " + newValue);
        } else {
            System.out.println("Invalid index");
        }
    }

    // DELETE - Delete element at specific position
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        System.out.println("Deleted element at index " + index);
    }

    // DELETE - Delete by value
    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteAt(i);
                System.out.println("Deleted " + value);
                return;
            }
        }
        System.out.println("Element not found");
    }

    // Get array size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ArrayCRUD arr = new ArrayCRUD();

        System.out.println("=== Array CRUD Operations ===");
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();

        arr.insertAt(1, 15);
        arr.display();

        System.out.println("Element at index 2: " + arr.get(2));

        arr.update(2, 25);
        arr.display();

        arr.deleteAt(0);
        arr.display();

        arr.deleteByValue(25);
        arr.display();
    }
}
