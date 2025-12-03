public class ExceptionHandling {
    public static void main(String[] args) {
        // Try-catch block
        try {
            int arr[] = {1, 2, 3};
            System.out.println("Element: " + arr[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        
        // Try-catch-finally
        try {
            int result = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
        
        // Multiple catch
        try {
            String str = null;
            System.out.println(str.length());
        } catch(NullPointerException e) {
            System.out.println("Null pointer exception caught");
        } catch(Exception e) {
            System.out.println("General exception caught");
        }
    }
}
