// INPUT / OUTPUT - Read String with Spaces
//14. Read a full name (first name + last name) and print it.

import java.util.Scanner;

class p14{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String str = sc.nextLine();

        System.out.println(str);
        sc.close();
    }
}