// IF ELSE SWITCH - NUMBER LOGIC
// 15. Check whether a number is a perfect number.
// Perfect number: A perfect number is a number whose sum of proper divisors equals the number itself.
class p15{
    public static void main (String[] args){
        int num = 28;
        int sum = 0;

        if(num > 0){
            for (int i =1; i <= num/2; i++){
                if(num%i == 0){
                    sum = sum + i;
                }
            }
        }
        else{
            System.out.println("Given Number is not a perfect Number");
        }

        if (sum == num){
            System.out.println("Given Number is a Perfect Number");
        }
        else {
            System.out.println("Given Number is not a perfect Number");
        }
    }
}