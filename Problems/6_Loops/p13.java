// LOOPS - DIGIT LOGIC
// 13. Reverse a given number.

class p13 {
    public static void main (String[] args){
        int num = 123456;
        int org_num = num;
        int rev_num = 0;

        while (num != 0){
            int digit = num%10;

            rev_num = rev_num * 10 + digit;

            num = num/10;
        }
        System.out.println("Reverse Number: " + rev_num);
    }
}