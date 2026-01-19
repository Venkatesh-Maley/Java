// LOOPS - MATH LOGIC
// 22. Print Fibonacci numbers less than N.

class p22 {
    public static void main (String[] args) {
        int num1 = 0;
        int num2 = 1;
        int n = 100;

        while (num1 <= n){
            System.out.print (num1 + " ");
            int next_num = num1 + num2;
            num1 = num2;
            num2 = next_num;
        }
    }
}