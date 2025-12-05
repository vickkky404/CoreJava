public class Prog7_ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digitCount = String.valueOf(num).length();
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    public static void main(String[] args) {
        int[] numbers = {153, 370, 371, 407, 1634, 100, 9};
        System.out.println("Armstrong Numbers:");
        for (int num : numbers) {
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is NOT an Armstrong number");
            }
        }
    }
}
