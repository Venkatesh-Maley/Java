import java.util.Scanner;

public class UnaryOperators{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 100;
        int Result;

        Result = +num;
        System.out.println("Result of Unary plus is:"+Result);

        Result = -num;
        System.out.println("Result of Unary Minus is:"+Result);

        Result = ++num;
        System.out.println("Result of Pre Increment is:"+Result);

        Result = --num;
        System.out.println("Result of Pre Decrement is:"+Result);

        Result = num++;
        System.out.println("Result of Post Increment is:"+Result);

        Result = num--;
        System.out.println("Result of Post Decrement is:"+Result);
    }
}