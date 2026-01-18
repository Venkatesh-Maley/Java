// IF ELSE SWITCH - NUMBER LOGIC
// 18. Count number of digits and sum of digits in a number.

class p18{
    public static void main (String[] args){
        int num = 1345;
        int original = num;
        int count = 0;
        int sum = 0;

        while(num>0){
            int digit = num%10;
            
            count++;

            sum = sum + digit;

            num = num/10;
            
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);

    }
}