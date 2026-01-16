// TypeCasting - ASCII Value
// 6. Read a character and print its ASCII value.

import java.util.Scanner;

class p6{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char x = sc.next().charAt(0);

        System.out.println("ASCII Value of"+ " " + x + " " + "is" + " " + (int) x);

    }
}