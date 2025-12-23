// ClassCast Exception Example
public class ClassCastEx {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            // This is valid - Integer is an Object
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Error: Cannot cast Integer to String");
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Invalid type casting attempted");
        }
    }
}
