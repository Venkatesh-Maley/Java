// Operators - Arithemetic Operators
// 4. Find remainder without using % operator.
//Remainder = Dividend – (Divisor × Quotient)

import java.util.Scanner;

class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend - (divisor * quotient);

        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
