// Operators - Logical Operators
// 13. Perform bitwise XOR of two numbers.

import java.util.Scanner;

public class p13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number:");
        int num1 = input.nextInt();

        System.out.println("Enter second Number:");
        int num2 = input.nextInt();

        System.out.println("Bitwise XOR:"+(num1 ^ num2));

        //others
        System.out.println("Bitwise NOT:"+(~num1));
        System.out.println("Bitwise Left Shift:"+(num1<<2));
        System.out.println("Bitwise Right SHift:"+(num1>>2));
        System.out.println("Bitwise Unsigned RIght Shift"+(num1>>>2));

    }

}