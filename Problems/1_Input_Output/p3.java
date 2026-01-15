// INPUT / OUTPUT - Read Integer / Float / Double
// 3. Read an integer and a float, print both.

import java.util.Scanner;

class p3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Int Value:");
        int int_value = sc.nextInt();

        System.out.println("Enter Float Value:");
        float float_value = sc.nextFloat();

        System.out.println("our Int value is: " + int_value +"\n" + "our float valu is: " + float_value);
    }
}
