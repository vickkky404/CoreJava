// NumberFormat Exception Example
public class NumberFormatEx {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "abc";
        
        try {
            // Valid conversion
            int num1 = Integer.parseInt(str1);
            System.out.println("num1 = " + num1);
            // This will throw NumberFormatException
            int num2 = Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
            System.out.println("Input cannot be converted to integer");
            System.out.println("Exception: " + e);
        }
    }
}
