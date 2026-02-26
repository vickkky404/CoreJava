public class ArrayCrud {
    static int[] arr = new int[10];
    static int size = 0;
    
    public static void create(int value) {
        if (size < arr.length) {
            arr[size] = value;
            size++;
            System.out.println("Element " + value + " created at index " + (size - 1));
        } else {
            System.out.println("Array is full");
        }
    }
    
    public static void read(int index) {
        if (index >= 0 && index < size) {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Invalid index");
        }
    }
    
    public static void update(int index, int value) {
        if (index >= 0 && index < size) {
            arr[index] = value;
            System.out.println("Element at index " + index + " updated to " + value);
        } else {
            System.out.println("Invalid index");
        }
    }
    
    public static void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Element at index " + index + " deleted");
        } else {
            System.out.println("Invalid index");
        }
    }
    
    public static void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        create(10);
        create(20);
        create(30);
        create(40);
        create(50);
        
        display();
        
        read(2);
        
        update(2, 99);
        display();
        
        delete(1);
        display();
    }
}
