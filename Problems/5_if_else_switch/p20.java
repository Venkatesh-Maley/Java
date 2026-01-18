// IF ELSE SWITCH - NUMBER LOGIC
// 20. Reverse a number

class p20 {
    public static void main (String[] args){
        int num = 2342;
        int original = num;
        int rev_num = 0;

        while (num > 0){
            int digit = num%10;

            rev_num = rev_num *10 + digit;

            num = num/10;
        }
        System.out.println("Original Number:" + original);
        System.out.println("Reverse Number:" + rev_num);
    }
}