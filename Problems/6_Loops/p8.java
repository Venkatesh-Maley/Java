// LOOPS - SERIES PRINTING
// 8. Print the square of numbers from 1 to N.

class p8 {
    public static void main (String[] args){
        int N = 20;

        for (int i = 1; i <= N; i++){
            int square_value = 1;

            square_value = i*i;
            System.out.println("Sqaure of " + i + " = " + square_value);
            i ++;
        }
    }
}
