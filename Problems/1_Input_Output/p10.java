// INPUT / OUTPUT - Read String (Single Word)
//10. Read a single word and print it.

import java.util.Scanner;

class p10{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String Value:");
        String x = sc.next();

        System.out.println("Your String:" + " " + x);
        
        sc.close();
    }
}