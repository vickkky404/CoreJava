//Java program to reverse an array...
import java.util.Arrays;
public class Declare {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Original array: " + Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0 ; i<n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 - 3];
            arr[n - i - 1] = temp;

            System.out.println("Reversed Array: " + Arrays.toString(arr));
        }
    }
}
