// Throw Statement Example
public class ThrowStatementEx {
    public static void checkNumber(int num) {
        if (num < 0) {
            throw new ArithmeticException("Number cannot be negative");
        } else if (num == 0) {
            throw new IllegalArgumentException("Number cannot be zero");
        } else {
            System.out.println("Valid number: " + num);
        }
    }
    
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
