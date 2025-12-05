public class Prog15_PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
    
    public static void printDivisors(int num) {
        System.out.print("Divisors of " + num + ": ");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] numbers = {6, 28, 496, 8128, 10, 20, 50, 100};
        
        System.out.println("Perfect Number Checker:");
        System.out.println("=".repeat(40));
        
        for (int num : numbers) {
            printDivisors(num);
            if (isPerfectNumber(num)) {
                System.out.println(num + " is a PERFECT number\n");
            } else {
                System.out.println(num + " is NOT a perfect number\n");
            }
        }
        
        System.out.println("\nFirst few perfect numbers: 6, 28, 496, 8128");
    }
}
