// Basic Try-Catch Block Example
public class TryCatchBasic {
    public static void main(String[] args) {
        try {
            // This will throw an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Program continues after catch block");
    }
}
