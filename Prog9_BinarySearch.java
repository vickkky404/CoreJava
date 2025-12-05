public class Prog9_BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] targets = {7, 1, 19, 10};
        
        System.out.println("Sorted Array: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]");
        for (int target : targets) {
            int index = binarySearch(arr, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index);
            } else {
                System.out.println("Element " + target + " not found");
            }
        }
    }
}
