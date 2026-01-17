// Operators - Logical Operators
// 11. Perform bitwise AND of two numbers.

import java.util.Scanner;

class p11{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number:");
        int num1 = input.nextInt();

        System.out.println("Enter second Number:");
        int num2 = input.nextInt();

        System.out.println("Bitwise AND:" +(num1 & num2));
    }
}
