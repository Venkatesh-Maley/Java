import java.util.Scanner;
class p6_Count_number {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int count = 0;

        while(num > 0 )
        {
            num = num/10;
            count++;
        }

        System.out.println("Count of Numbers: " + count);
    }
}


