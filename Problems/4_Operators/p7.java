// Operators - Relational Operators
// 7. Check whether a number is positive, negative, or zero.

import java.util.Scanner;

class p7{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0){
            System.out.println("num is a negative number");
        }
        else if(num > 0){
            System.out.println("num is a positive number");
        }
        else{
            System.out.println("num is a Zero");
        }
    }
}