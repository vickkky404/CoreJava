public class FlowControl {
    public static void main(String[] args){

        System.out.println("Contol Flow program");

        // if statement
        int number = 20;
        if(number > 0){
            System.out.println("The number is positive");
        }

        // if-else
        if(number  % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }


        // if else..if else
        if(number < 0){
            System.out.println("The Number is negative");
        }else if(number == 0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is positive");
        }


        // switch case
        int day = 3;
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
                case 3 :
                System.out.println("Wednesday");
            default:
                System.err.println("Other day");
        }



    }  
}
