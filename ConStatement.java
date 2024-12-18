import java.util.Scanner;  

public class ConStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
		
        if (num * num2 == 20) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
