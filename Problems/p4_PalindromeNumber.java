// Palindrome Number - A palindrome Number is a number that remainds the same when its digits are reversed Ex: 12321
import java.util.Scanner ;

class p4_PalindromeNumber {
    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");

    int num = sc.nextInt();
    int org_num = num;

    int rev = 0;
    
    while(num!=0){
        rev = rev*10 + num%10;
        num = num/10;
    }

    if(org_num == rev)
    {
        System.out.println("This Number is a Palindrome number");
    }
    else
    {
        System.out.println("This Number is not a Palindrome");
    }

    }


}
