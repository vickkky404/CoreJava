public class Prog14_GCD_LCM {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        // More examples
        int[][] pairs = {{12, 8}, {15, 25}, {100, 50}};
        for (int[] pair : pairs) {
            System.out.println("\nGCD(" + pair[0] + ", " + pair[1] + ") = " + findGCD(pair[0], pair[1]));
            System.out.println("LCM(" + pair[0] + ", " + pair[1] + ") = " + findLCM(pair[0], pair[1]));
        }
    }
}
