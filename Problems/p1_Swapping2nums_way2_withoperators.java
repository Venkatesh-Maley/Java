//5 Different ways of swappig two numbers

class p1_Swapping2nums_way2_withoperators {
    public static void main(String [] args) {
        int a = 10;
        int b = 20;

        int x = 10;
        int y = 20;

        int i = 10;
        int j = 20;

        int m = 10;
        int n = 20;

         //Logic2 - using + and - Operators

        System.out.println("Before Swapping using + and - operators: " + a + " " + b );

        a = a +b ;   //a = 10 + 20 = 30 
        b = a - b;   //b = 30 - 20 = 10
        a = a- b;    //a = 30 - 10 = 20

        System.out.println("After Swapping using + and - operators: " + a + " " + b);

        //Logic3 - using * and / operators
        //This logic works if and only if, x and y are not equal to zero

        System.out.println("Before Swapping using * and / operators: " + x + " " + y );

        x = x*y;    //10 * 20 = 200
        y = x/y;    //200 / 20 = 10
        x = x/y;    //200 / 10 = 20

        System.out.println("After Swapping using * and / operators: " + x + " " + y);


        //Logic4 = bitwise XOR (^)

        System.out.println("Before Swapping using XOR: " + x + " " + y );

        i = i^j;    //10^20 = 30
        j = i^j;    //30^20 = 10 
        i = i^j;    //30^10 = 20

        System.out.println("After Swapping using XOR: " + i + " " + j );

        //Login5 - single Statement

        System.out.println("Before Swapping using XOR: " + m + " " + n );

        n = m + n - (m=n);

        System.out.println("After Swapping using XOR: " + m + " " + n );


    }
}