public class ArmstrongNumberChecker {
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers: ");
        for (int i = 100; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
