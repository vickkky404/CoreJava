public class Loops {
    public static void main(String[] args){

        // for loop...
        System.out.println("\nFor Loop");
        for(int i = 0 ; i  <= 5 ; i++){
            System.out.println("i = " + i);
        }

        // while loop\
        System.out.println("\nWhile");
        int j = 1;
        while(j <= 5 ){
            System.out.println("j = " + j);
            j++;
        }

        // do-while loop..
        System.out.println("\nDo-While");
        int k =1;
        do { 
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);




        // for-each loop / Enhancaed For looop
        System.out.println("\nEnhanced For Loop");

        int[] num = {10,20,30,40,50};
        for(int itrt : num){
            System.out.println("Values: " + itrt);
        }
    }
    
}
