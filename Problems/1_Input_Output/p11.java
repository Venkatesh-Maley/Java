// INPUT / OUTPUT - Read String (Single Word)
//11. Read a string and print its length.

import java.util.Scanner;

class p11{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String x = sc.next();
        System.out.println("Your String value:" + " " + x);

        int str_len = x.length();

        //Using length() build-in function
        System.out.println("String length:" + " " + str_len);

    }
}