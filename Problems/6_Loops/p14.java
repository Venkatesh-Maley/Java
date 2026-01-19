// LOOPS - DIGIT LOGIC
// 14. Check whether a number is a palindrome.

class p14 {
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

        if( org_num == rev_num){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a Palindrome Number");
        }
    }
}