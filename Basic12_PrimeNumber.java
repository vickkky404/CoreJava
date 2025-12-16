public class Basic12_PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        if (num < 2) isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) { isPrime = false; break; }
        }
        System.out.println(num + " is " + (isPrime ? "Prime" : "Not Prime"));
    }
}
