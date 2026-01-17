// Operators - Arithemetic Operators
// 3. Find area of circle using radius.
// Area = π × r × r

import java.util.Scanner;

class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area of Circle: " + area);
        sc.close();
    }
}
