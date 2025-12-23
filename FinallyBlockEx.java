// Finally Block Example
public class FinallyBlockEx {
    public static void main(String[] args) {
        try {
            int[] num = {5, 10};
            System.out.println("Trying to access array[5]: " + num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executes regardless of exception");
            System.out.println("Resource cleanup can be done here");
        }
        System.out.println("Program completed successfully");
    }
}
