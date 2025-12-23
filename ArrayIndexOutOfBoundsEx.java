// ArrayIndexOutOfBounds Exception Example
public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        
        try {
            // Array index exceeds the array length
            System.out.println("Array element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Array length is: " + numbers.length);
        }
    }
}
