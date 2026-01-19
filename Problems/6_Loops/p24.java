// LOOPS - MATH LOGIC
// 24. Print all prime numbers between 1 and N.

class p24 {
    public static void main (String[] args){
        int N = 30;

        for (int i = 2; i <= N; i++){
            boolean isPrime = true;

            for (int j = 2; j <= i/2; j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
             
        }
    }
}