// INPUT / OUTPUT - Read String with Spaces
//13. Read a full sentence and print it.

import java.util.Scanner;

class p13{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Paragraph:");
        String str = sc.nextLine();

        System.out.println(str);

        sc.close();
    }
}
