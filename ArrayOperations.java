public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        
        // Sum of array
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        
        // Find maximum
        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);
        
        // Find minimum
        int min = arr[0];
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        System.out.println("Minimum: " + min);
    }
}
