// Nested Try-Catch Example
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            String[] names = {"Alice", "Bob"};
            try {
                System.out.println("Trying inner block");
                System.out.println(names[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: General exception");
            System.out.println("Error: " + e);
        }
        System.out.println("Execution continues");
    }
}
