public class PrimeNumberChecker {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 10, 17, 20, 29, 31, 50};
        System.out.println("Prime Number Checker");
        System.out.println("=".repeat(30));
        for (int num : numbers) {
            System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
        }
    }
}
