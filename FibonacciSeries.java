public class FibonacciSeries {
    public static void printFibonacci(int n) {
        long num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            long temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println();
    }

    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("=== Fibonacci Series Using Loop ===");
        printFibonacci(10);
        System.out.println("\n=== Fibonacci Using Recursion ===");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
}
