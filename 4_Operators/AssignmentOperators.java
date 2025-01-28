import java.util.Scanner;
public class AssignmentOperators{
    public static void main(String[] args)
    {
        int a=4;
        int x;
        
        x=a;
        System.out.println("x Value Using = :"+x);

        x+=a;
        System.out.println("x Value Using += :"+x);

        x-=a;
        System.out.println("x Value Using -= :"+x);

        x*=a;
        System.out.println("x Value Using *= :"+x);

        x/=a;
        System.out.println("x Value Using /= :"+x);

        x%=a;
        System.out.println("x Value Using %= :"+x);
    }
}