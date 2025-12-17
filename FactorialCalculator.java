// Program to calculate factorial of a number
public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
