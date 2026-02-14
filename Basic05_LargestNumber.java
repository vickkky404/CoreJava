// Java Program
public class Basic05_LargestNumber {
    public static void main(String[] args) {
        int a = 50, b = 30, c = 40;
        if (a > b && a > c)
            System.out.println(a + " is the greatest");
        else if (b > a && b > c)
            System.out.println(b + " is the greatest");
        else
            System.out.println(c + " is the greatest");
    }
}
