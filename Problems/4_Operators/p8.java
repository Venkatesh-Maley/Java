// Operators - Logical Operators
// 8. Check if a number is between 10 and 50.

import java.util.Scanner;

class p8{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 10 && num < 50){
            System.out.println("Given num is between 10 and 50");
        }
        else{
            System.out.println("Given num is not in between 10 and 50");
        }
    }   
}