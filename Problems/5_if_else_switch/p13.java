// IF ELSE SWITCH - NUMBER LOGIC
// 13. Check whether a number is prime (basic logic).

class p13{
    public static void main (String[] args){
        //Basic Logic
        int num = 12;
        boolean isPrime = true;

        if (num <= 1){
            isPrime = false;
        }
        else{
            for( int i = 2; i <= num/2; i++){
                if(num%i ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Given Number is a Prime Number");
        }
        else {
            System.out.println("Given Number is not a Prime Number");
        }

        //optimized Java program that uses the √n (square root) concept
        int x = 29;
        boolean isPrimeNum = true;

        if (x <= 1) {
            isPrimeNum = false;
        } else {
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
        }

        if (isPrimeNum) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}