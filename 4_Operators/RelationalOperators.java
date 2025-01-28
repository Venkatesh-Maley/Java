import java.util.Scanner;
public class RelationalOperators{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int Num1=scan.nextInt();

        System.out.println("Enter Second Number");
        int Num2=scan.nextInt();

        System.out.println("Num1 > Num2 is "+ (Num1 > Num2));
        System.out.println("Num1 < Num2 is "+ (Num1 < Num2));
        System.out.println("Num1 >= Num2 is "+ (Num1 >= Num2));
        System.out.println("Num1 <= Num2 is "+ (Num1 <= Num2));
        System.out.println("Num1 == Num2 is "+ (Num1 == Num2));
        System.out.println("Num1 != Num2 is "+ (Num1 != Num2));
    }
}