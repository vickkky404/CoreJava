public class StringOperations {
    public static void main(String[] args) {
        String str = "Java Programming";
        
        // String length
        System.out.println("Length: " + str.length());
        
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Check if contains
        System.out.println("Contains 'Java': " + str.contains("Java"));
        
        // String replace
        System.out.println("Replace: " + str.replace("Java", "Python"));
        
        // String reverse
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
        
        // Character at index
        System.out.println("Char at 0: " + str.charAt(0));
        
        // Substring
        System.out.println("Substring: " + str.substring(0, 4));
    }
}
