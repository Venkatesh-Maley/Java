// Operators - Logical Operators
//15. Find whether a number is even or odd using bitwise operator.
//Logic:
// Last bit (LSB) decides even/odd
// number & 1
// Result 0 → Even
// Result 1 → Odd

import java.util.Scanner;

class p15{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        if ((num & 1) == 0){
            System.out.println("even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
