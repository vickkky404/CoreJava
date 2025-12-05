public class Prog3_PrimeNumberCheck {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 5, 10, 11, 20, 23};
        for (int num : numbers) {
            System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
        }
    }
}
