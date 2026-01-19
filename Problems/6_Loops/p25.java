// LOOPS - MATH LOGIC
// 25. Count how many prime numbers are in a given range.

class p25 {
    public static void main (String[] args){
        int N = 30;
        int count = 0;

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
                count++;
            }             
        }
        System.out.println("Count of prime numbers are in a given range: " + count);

    }
}