public class Prog6_StringReverse {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String reverseStringManual(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }
    
    public static void main(String[] args) {
        String[] strings = {"Hello", "Java", "Racecar", "A man, a plan, a canal: Panama"};
        for (String s : strings) {
            System.out.println("Original: " + s);
            System.out.println("Reversed: " + reverseString(s));
            System.out.println("Is Palindrome: " + isPalindrome(s));
            System.out.println();
        }
    }
}
