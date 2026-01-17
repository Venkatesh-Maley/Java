// Operators - Relational Operators
// 6. Check if two numbers are equal.

import java.util.Scanner;

class p6{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Num1 is equal to Num2");
        }
        else{
            System.out.println("Num1 is not equal to Num2");
        }
    }
}
