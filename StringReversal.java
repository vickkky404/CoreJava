public class StringReversal {
    public static String reverseUsingLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseUsingRecursion(String str) {
        if (str.isEmpty())
            return str;
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java", "Programming"};
        System.out.println("String Reversal Examples");
        System.out.println("=".repeat(40));
        for (String str : strings) {
            System.out.println("Original: " + str + " -> Reversed: " + reverseUsingStringBuilder(str));
        }
    }
}
