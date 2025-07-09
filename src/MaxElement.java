//find the maximum Element in an array
public class MaxElement {
    public static void main(String[] args){
        int [] arr = {20,44,35,87,86};
        int maxElement = arr[0];

        for(int i = 1; i < arr.length ; i++){
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum Element: " + maxElement);
    }
}
