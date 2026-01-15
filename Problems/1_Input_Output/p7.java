// INPUT / OUTPUT - Read Character
//7. Read a character and print its ASCII value.

import java.util.Scanner;

class p7{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter something:");
        char x = sc.next().charAt(0);

        System.out.println("Entered value:" + " "+ x);
        System.out.println("ASCII value:" + " " + (int) x);

        sc.close();
    }
}