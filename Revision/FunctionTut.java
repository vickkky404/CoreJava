package Revision;

public class FunctionTut {
    public static void main(String[] args) {
        a = 10;
        b = 20;
        swap(a,b);

    }
    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
