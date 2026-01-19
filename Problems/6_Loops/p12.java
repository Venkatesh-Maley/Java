// LOOPS - DIGIT LOGIC
// 12. Find the product of digits of a number.

class p12 {
    public static void main (String[] args){
        int num = 44567;
        int count = 0;
        int prod = 1;
        while (num != 0){
            int digit = num%10;

            num = num/10;

            count ++;   

            prod = prod * digit;
        }
        System.out.println(count);
        System.out.println(prod);
    }
}