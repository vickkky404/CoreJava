public class Prog5_ArraySum {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) return 0;
        return (double) calculateSum(arr) / arr.length;
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array: [10, 20, 30, 40, 50]");
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Maximum: " + findMax(numbers));
    }
}
