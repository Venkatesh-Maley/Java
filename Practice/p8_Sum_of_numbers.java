import java.util.Scanner;

class p8_Sum_of_numbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number1: ");
        int Num1 = sc.nextInt();

        int Sum1 = 0;

        while(Num1 > 0){
            int last = Num1%10;
            Sum1 = Sum1 + last;
            Num1 = Num1/10; 
        }
        
        System.out.println("Sum of Digits of given number: " + Sum1);
    }    
}
