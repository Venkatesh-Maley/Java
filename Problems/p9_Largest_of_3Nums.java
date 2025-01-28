import java.util.Scanner;

class p9_Largest_of_3Nums {
    public static void main(String[] args) {
        

        //Logic1 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your 1st Number: ");
        int x = sc.nextInt();
        
        System.out.println("Enter your 2nd Number: ");
        int y = sc.nextInt();
        
        System.out.println("Enter your 3rd Number: ");
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println(x + " is the largest number");
        } 
        else if (y > x && y > z) {
            System.out.println(y + " is the largest number");
        }
        else if (z > x && z > y) {
            System.out.println(z + " is the largest number");
        } 
        else if (x == y && x > z) {
            System.out.println(x + " and " + y + " are equal and are the largest numbers");
        } 
        else if (y == z && y > x) {
            System.out.println(y + " and " + z + " are equal and are the largest numbers");
        } 
        else if (z == x && z > y) {
            System.out.println(z + " and " + x + " are equal and are the largest numbers");
        } 
        else {
            System.out.println("All three numbers are equal");
            
        }
        
        System.out.println("**************************");


        //Logic2 - Using Ternary operator
        int a=10,b=20,c=30;

        System.out.println("Given Three numbers are:" + " " + a + " " + b + " " + c );

        int largest1 = a>b?a:b; //Largest 0f a & b
        int largest2 = c>largest1?c:largest1; //Largest of x & Largest1

        System.out.println(largest2 + " is Largest Number");

        int largest = c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(largest + " is Largest number");


        System.out.println("**************************");

        sc.close();
    }
}
