// IF ELSE SWITCH - Basic conditions
// 5. Check whether a number is divisible by either 7 or 13.

class p5{
    public static void main (String[] args){
        int num = 110;

        if ((num%7 == 0) || (num%13 == 0)){
            System.out.println("Given number is divible by either 7 or 13");
        }
        else{
            System.out.println("Given number is not divisible by neither 7 nor 13");
        }
    }
}