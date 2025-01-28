//Natural Number
//Which has only 2 factors 1 and itself

import java.util.Scanner;

class p11_Prime_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int count = 0;

        if(num > 1){
            for(int i = 1; i <= num; i ++){
                if(num%i == 0){
                    count++;               
                }
            }
            if(count == 2){
                System.out.println( num + " is a Prime Number");
            }
            else{
                System.out.println(num + " is not a Prime Number");
            }

        }
        else{
            System.out.println(num +" is not a Prime Number ");
        }
    }
}
