import java.util.Scanner;

class p2_ReverseNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Write a Number1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Write a Number2: ");
        int num2 = sc.nextInt();

        System.out.println("Write a Number3: ");
        int num3 = sc.nextInt();


        //1. using Algorithm

        int x = 0;

        while ( num1 != 0){ 
            x = x*10 + num1%10 ;
            num1 = num1/10;

        }

        System.out.println("After Reversing: " + x );

        //2. using StringBuffer Class

        StringBuffer sb = new StringBuffer(String.valueOf(num2));
        StringBuffer reversed = sb.reverse();

        System.out.println("After Reversing using StringBuffer class: " + reversed);
        
        //3. using StringBuilder Class

        StringBuilder sbl = new StringBuilder();

        sbl.append(num3);

        StringBuilder reversedb = sbl.reverse();

        System.out.println("Reverse number using StringBuilderis: " + reversedb);
    }
}




