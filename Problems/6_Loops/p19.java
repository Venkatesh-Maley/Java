// LOOPS - DIGIT LOGIC
// 19. Check whether the sum of digits is even or odd.

class p19 {
    public static void main (String[] args){
        int num = 344534;
        int num_len = String.valueOf(num).length();
        int sum = 0;

        // Better Approach than using for loop
        // while (num != 0) { 
        //     int digit = num % 10;
        //     sum += digit;
        //     num /= 10;
        // }

        for (int i = 1; i <= num_len; i++){
            int digit = num%10;
            sum = sum + digit;

            num = num/10;
        }
        System.out.println(sum);

        if (sum%2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
