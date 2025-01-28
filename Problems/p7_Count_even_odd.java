import java.util.Scanner;

class p7_Count_even_odd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int Num = sc.nextInt();

        int even_count = 0;
        int odd_count = 0;

        while(Num > 0){
            int last = Num%10;

            if(last%2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
            // Update Num by removing the last digit
            Num = Num / 10; 
        }
        System.out.println("Number of Even numbers: " + even_count);
        System.out.println("Number of odd numbers: " + odd_count);

    }    
}
