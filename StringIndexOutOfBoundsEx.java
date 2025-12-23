// StringIndexOutOfBounds Exception Example
public class StringIndexOutOfBoundsEx {
    public static void main(String[] args) {
        String str = "Hello";
        
        try {
            // Valid character access
            System.out.println("Character at 1: " + str.charAt(1));
            // This will throw StringIndexOutOfBoundsException
            System.out.println("Character at 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bounds");
            System.out.println("String length is: " + str.length());
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
