// LOOPS - SERIES PRINTING
// 3. Print all even numbers between 1 and N.

class p3 {
    public static void main (String[] args){
        int N = 20;

        for (int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        int n = 20;
        int i = 1;

        while (i <= n){
            if (i % 2 == 0){
                System.out.println(i);  
            }
            i++;
        }
    }
}