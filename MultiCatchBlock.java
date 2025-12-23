// Multiple Catch Blocks Example
public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            String str = "123abc";
            int num = Integer.parseInt(str);
            int[] arr = {10, 20};
            System.out.println(arr[5]);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
            System.out.println("Cannot convert string to integer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            System.out.println("Array index is out of range");
        } catch (Exception e) {
            System.out.println("Caught generic Exception");
            System.out.println("Some error occurred: " + e);
        }
    }
}
