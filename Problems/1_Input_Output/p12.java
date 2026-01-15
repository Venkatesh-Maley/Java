// INPUT / OUTPUT - Read String (Single Word)
//12. Read a name and print Hello <name>.

import java.util.Scanner;

class p12{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String Value:");
        String name_str = sc.next();
        System.out.println("Hello" + " " + name_str);
    }
}