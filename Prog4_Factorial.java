public class Prog4_Factorial {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        for (int num : numbers) {
            System.out.println("Factorial of " + num + " (Recursive): " + factorial(num));
            System.out.println("Factorial of " + num + " (Iterative): " + factorialIterative(num));
        }
    }
}
