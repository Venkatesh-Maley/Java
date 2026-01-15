// INPUT / OUTPUT - Read Integer / Float / Double
// 4. Read a double value and print it.

import java.util.Scanner;

class p4{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Double Value:");
        double d =sc.nextDouble();

        System.out.println("Our Double Value:\n"+ d);
        sc.close();
    }
}