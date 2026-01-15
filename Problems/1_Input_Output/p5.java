// INPUT / OUTPUT - Read Integer / Float / Double
// 5. Read three numbers (int, float, double) and print them.

import java.util.Scanner;

class p5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers (int float and double):");
        int int_value = sc.nextInt();
        float float_value = sc.nextFloat();
        double double_value = sc.nextDouble();

        System.out.println("int_value:" + int_value + "\nfloat_value:" + float_value + "\ndouble_value:" + double_value);
    }
}