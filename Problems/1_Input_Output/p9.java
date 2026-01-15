// INPUT / OUTPUT - Read Character
//8. Read a character and check if it is uppercase or lowercase.

import java.util.Scanner;

class p9{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char x = sc.next().charAt(0);

        if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')){
            if (x >= 'A' && x <= 'Z'){
                System.out.println("Given character is an Uppercase Alphabet");
            }
            else{
                System.out.println("Given character is an Lowercase Alphabet");
            }
        }
        else{
            System.out.println("Given character is not an Alphabet");
        }
        
        sc.close();
    }
}