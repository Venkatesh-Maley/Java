// LOOPS - MATH LOGIC
// 21. Print the Fibonacci series up to N terms.

class p21 {
    public static void main (String[] args){
        int num1 = 0;
        int num2 = 1;

        int N = 20;

        for (int i = 1; i <= N; i++){
            
            System.out.print( num1 + " ");
            int next_num = num1 + num2;
            num1 = num2;
            num2 = next_num;
            
        }
    }
}