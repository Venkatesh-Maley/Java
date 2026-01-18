// IF ELSE SWITCH - REAL-WORLD LOGIC PROGRAMS
// 23. Read marks of 5 subjects and calculate percentage and grade.

// ≥90 → A

// ≥75 → B

// ≥60 → C

// <60 → Fail

import java.util.Scanner;

class p23{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Subjects Marks:");
        int sub1_marks = sc.nextInt();
        int sub2_marks = sc.nextInt();
        int sub3_marks = sc.nextInt();
        int sub4_marks = sc.nextInt();
        int sub5_marks = sc.nextInt();

        int sum = 0;
        int count = 5;

        sum = sub1_marks + sub2_marks + sub3_marks + sub4_marks + sub5_marks;
        
        // Percentage
        double percentage = (sum * 100.0) / 500;


        System.out.println("Percentage:" + percentage);

        // Grade
        if (percentage >= 90){
            System.out.println("Grade A");
        }
        else if (percentage >= 75){
            System.out.println("Grade B");
        }
        else if (percentage >= 60){
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}