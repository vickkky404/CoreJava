import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for the user's age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Display the collected information
        System.out.println("\nHello, " + name + "! You are " + age + " years old.");
    }
}


