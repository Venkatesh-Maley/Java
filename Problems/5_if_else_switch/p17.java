// IF ELSE SWITCH - NUMBER LOGIC
// 17. Check whether a number is an Armstrong number (optional but common).
//An Armstrong number (or narcissistic number) is a number that equals the sum of its own digits, each raised to the power of the total number of digits in the number, such as 153

class p17{
    public static void main (String[] args){
        int num = 153;
        int original = num;
        int num_len = String.valueOf(num).length();
        int sum = 0;

        while(num > 0){
            int digit = num%10;
            int power = 1;

            for (int i = 1; i <= num_len; i++){
                power = power * digit;
            }
            sum = sum + power;
            num = num/10;
        }

        if(sum == original){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}