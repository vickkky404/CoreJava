// Program to find sum of digits
public class Program03_SumOfDigits {
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}
