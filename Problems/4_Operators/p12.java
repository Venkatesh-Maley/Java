// Operators - Logical Operators
// 12. Perform bitwise OR of two numbers.

import java.util.Scanner;

class p12{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number:");
        int num1 = input.nextInt();

        System.out.println("Enter second Number:");
        int num2 = input.nextInt();

        System.out.println("Bitwise OR:" +(num1 | num2));
    }
}