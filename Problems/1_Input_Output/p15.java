// INPUT / OUTPUT - Read String with Spaces
//15. Read a sentence and count number of characters.

import java.util.Scanner;

class p15{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        int str_len = str.length();
        System.out.println("String length:" + " " + str_len);
    }
}