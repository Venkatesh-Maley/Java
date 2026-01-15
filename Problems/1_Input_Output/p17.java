// INPUT / OUTPUT - Print Output
//17. Print your name, age, and city on separate lines

import java.util.Scanner;

class p17{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");        
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter your city:");
        String city = sc.nextLine();

        System.out.println("Details:" + " " + name + " " + age + " " + city);

        sc.close();
    }
}