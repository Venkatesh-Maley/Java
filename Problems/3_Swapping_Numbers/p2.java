// Swapping Numbers - Swap Using Third Variable
// 2. Swap two integers and print before and after swapping.

import java.util.Scanner;

class p2{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 2 integers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before Swapping:\n" + num1 + "\n" +num2);

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping:\n" + num1 + "\n" +num2);

    }
}