// Program to reverse a number
public class Program02_NumberReversal {
    public static void main(String[] args) {
        int num = 12345, reversed = 0;
        int temp = num;
        
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reversed);
    }
}
