// INPUT / OUTPUT - Read Character
//6. Read a single character using Scanner.

import java.util.Scanner;

class p6{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something:");
        char first_char = sc.next().charAt(0);
        System.out.println("First Character:" + first_char);

        sc.close();
    }
}