import java.util.Scanner;
class p5_PalindromeString {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Value: ");

        String str = sc.next();
        
        String Org_str = str;
        int len = str.length();

        String rev = ""; 

        for(int i = len - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(Org_str);
        System.out.println(rev);


        if(Org_str.equals(rev)){
            System.out.println("This String is a Palindrome");
        }
        else
        {
            System.out.println("This String is not a Palindrome");
        }
    }
}
