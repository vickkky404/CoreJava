import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets create a basic calculator in JAVA by using arithmatic opeations....");

        System.out.print("Enter the number: ");
        int a =sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The addition is: " + a+b);
        System.out.println("The substraction is: " + (a-b));
        System.out.println("The division is: " + a/b);
        System.out.println("The multiplication is: " + a*b);

    }
}
