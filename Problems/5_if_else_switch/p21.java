// IF ELSE SWITCH - NUMBER LOGIC
// 21. Check Palindrome Number

class p21 {
    public static void main (String[] args){
        int num = 242;
        int original = num;
        int rev_num = 0;

        while (num > 0){
            int digit = num%10;

            rev_num = rev_num *10 + digit;

            num = num/10;
        }
        System.out.println("Original Number:" + original);
        System.out.println("Reverse Number:" + rev_num);

        if(original == rev_num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}