public class Prog1_PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String[] tests = {"A man, a plan, a canal: Panama", "race a car", "0P"};
        for (String test : tests) {
            System.out.println(test + " -> " + isPalindrome(test));
        }
    }
}
