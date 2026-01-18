// IF ELSE SWITCH - SWITCH-CASE PROGRAMS
// 32. Create a calculator using switch: +, −, *, /

import java.util.Scanner;

class p32 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y Values:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("x and y values are:\n" + x + "\n" + y);

        System.out.println("Enter a operator:");
        char selected_operator = sc.next().charAt(0);

        //using if else if else
        if(selected_operator == '+'){
            System.out.println("addition of x and y: " + (x + y));
        }
        else if (selected_operator == '-'){
            System.out.println("subtraction of x and y: " + (x - y));
        }
        else if (selected_operator == '*'){
            System.out.println("multiplication of x and y: " + (x * y));
        }
        else if (selected_operator == '/'){
            if (y != 0){
                System.out.println("Division of x and y: " + (x/y));
            }
            else {
                System.out.println("Zero is not allowed to division in denominator");
            }
        }
        else {
            System.out.println("Invalid operator");
        }

        //using SWITCH CASE
        switch (selected_operator) {
            case '+':
                System.out.println("Addition: " + (x + y));
                break;

            case '-':
                System.out.println("Subtraction: " + (x - y));
                break;

            case '*':
                System.out.println("Multiplication: " + (x * y));
                break;

            case '/':
                if (y != 0) {
                    System.out.println("Division: " + (x / y));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();

    }
}

