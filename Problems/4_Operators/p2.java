// Operators - Arithemetic Operators
// 2. Calculate simple interest.
// Simple Interest = (P × T × R) / 100

import java.util.Scanner;

class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        double si = (p * t * r) / 100;

        System.out.println("Simple Interest: " + si);
        sc.close();
    }
}
