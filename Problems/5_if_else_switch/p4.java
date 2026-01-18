// IF ELSE SWITCH - Basic conditions
// 4. Check whether a number is divisible by both 5 and 11.

class p4{
    public static void main (String[] args){
        int num = 110;

        if ((num%5 == 0) && (num%11 == 0)){
            System.out.println("Given number is divible by both 5 and 11");
        }
        else{
            System.out.println("Given number is NOT divisible by both 5 and 11");
        }
    }
}