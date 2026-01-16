// TypeCasting - ASCII Value
// 8. Convert lowercase letter to uppercase using ASCII logic.

import java.util.Scanner;

class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a lowercase letter:");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            char upper = (char)(ch - 32);   // ASCII logic
            System.out.println("Uppercase: " + upper);
        } else {
            System.out.println("Not a lowercase letter");
        }

        sc.close();
    }
}
