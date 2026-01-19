// LOOPS - MATH LOGIC
// 20. Find the factorial of a number using a loop.

class p20{
    public static void main (String[] args){
        int num = 4;

        int factorial = 1;

        for (int i = 0; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}