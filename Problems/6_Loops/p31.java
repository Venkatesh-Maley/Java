// LOOPS - DO-WHILE BASED QUESTIONS
// 31. Read numbers repeatedly until user enters 0 (use do-while).

import java.util.Scanner;

class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        } while (num != 0);

        System.out.println("Program stopped because 0 was entered.");
    }
}

