// Arithmetic Exception Example
public class ArithmeticEx {
    public static void main(String[] args) {
        try {
            int num1 = 50;
            int num2 = 0;
            // Trying to divide by zero
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot perform arithmetic operation");
            System.out.println("Details: " + e.getMessage());
        }
        System.out.println("Program execution continues");
    }
}
