public class Swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("beforeswap");
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:..");
        System.out.println("The value of a after swap:  " + a);
        System.out.println("The value of b after swap:  " + b);
    }
}
