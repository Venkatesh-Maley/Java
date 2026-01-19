// LOOPS - DIGIT LOGIC
// 11. Find the sum of digits of a number.

class p11 {
    public static void main (String[] args){
        int num = 44567;
        int count = 0;
        int sum = 0;
        while (num != 0){
            int digit = num%10;

            num = num/10;

            count ++;   

            sum = sum + digit;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}