public class HalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int line=1 ; line <= n ; line++){
            // printing Numbers
            for(int num=1 ; num <=line ; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}