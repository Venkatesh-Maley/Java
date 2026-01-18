// IF ELSE SWITCH - NUMBER LOGIC
// 16. Check whether a number is a strong number.
//A strong number is a number whose sum of the factorials of its digits is equal to the number itself.

class p16{
    public static void main (String[] args){
        int num = 145;
        int original = num; 
        int sum = 0;

        while (num >0){
            int digit = num%10;
            int fact = 1;

            for (int i = 1; i <= digit; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            num = num/10;
        }

        if (sum == original){
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }

    }
}