// Throws Keyword Example
public class ThrowsKeywordEx {
    // Method that throws exception
    public static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }
    
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Cannot divide by zero");
            System.out.println("Error: " + e.toString());
        }
    }
}
