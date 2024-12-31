import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int a =sc.nextInt();

        System.out.print("Enter the second number: ");
        int b =sc.nextInt();

        System.out.println(  "the addition is"+  a + b);
        System.out.println(   a - b);
        System.out.println(a / b);
        System.out.println(a * b);
    }
    
}
