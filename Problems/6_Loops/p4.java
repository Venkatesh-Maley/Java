// LOOPS - SERIES PRINTING
//4. Print all odd numbers between 1 and N.

class p4 {
    public static void main (String[] args){
        int N = 20;

        for (int i = 1; i <= N; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        int n = 20;
        int i = 1;

        while (i <= n){
            if (i % 2 != 0){
                System.out.println(i);  
            }
            i++;
        }
    }
}