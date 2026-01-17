// Operators - Relational Operators
// 5. Compare two numbers and print which is greater.

import java.util.Scanner;

import java.util.Scanner;

class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } 
        else if (num2 > num1) {
            System.out.println("Greater number is: " + num2);
        } 
        else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}

