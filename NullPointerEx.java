// NullPointer Exception Example
public class NullPointerEx {
    public static void main(String[] args) {
        String str = null;
        
        try {
            // This will throw NullPointerException
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Object reference is null");
            System.out.println("Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
