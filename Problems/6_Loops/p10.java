// LOOPS - DIGIT LOGIC
// 10. Count the number of digits in a given number.

class p10 {
    public static void main (String[] args){
        int num = 44567;
        int count = 0;

        while (num != 0){
            int digit = num%10;

            num = num/10;

            count ++;   
        }
        System.out.println(count);
    }
}