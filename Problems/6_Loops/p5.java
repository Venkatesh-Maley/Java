// LOOPS - SERIES PRINTING
// 5. Print the multiplication table of a given number.

import java.util.Scanner;

class p5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++){
            int output = 1;

            output = num * i;
            System.out.println(num + "x" + i + "=" + output);
        }

    }
}