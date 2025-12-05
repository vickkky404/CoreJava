public class Prog2_FibonacciSeries {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Fibonacci series up to 10 numbers:");
        printFibonacci(10);
    }
}
