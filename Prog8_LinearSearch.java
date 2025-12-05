public class Prog8_LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3, 7, 1, 9};
        int[] targets = {8, 3, 10, 1};
        
        System.out.println("Array: [5, 2, 8, 12, 3, 7, 1, 9]");
        for (int target : targets) {
            int index = linearSearch(arr, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index);
            } else {
                System.out.println("Element " + target + " not found");
            }
        }
    }
}
