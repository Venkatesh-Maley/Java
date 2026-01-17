// Operators - Logical Operators
// 9. Check whether a character is a vowel using logical operators.

import java.util.Scanner;

class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            System.out.println("Given character is a vowel");
        } else {
            System.out.println("Given character is not a vowel");
        }

        sc.close();
    }
}