// INPUT / OUTPUT - Read Integer / Float / Double
// 2. Read two integers and print their sum.

import java.util.Scanner;

class p2{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your num1:");
        int num1 = sc.nextInt();

        System.out.println("Enter your num2:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of two numbers:\n" + sum);
        sc.close();
    }
}