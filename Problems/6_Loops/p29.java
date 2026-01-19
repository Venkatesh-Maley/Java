// LOOPS - MATH LOGIC
// 29. Check whether two numbers are co-prime.

class p29 {
    public static void main(String[] args) {
        int a = 8;
        int b = 15;
        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        if (gcd == 1) {
            System.out.println("Co-prime Numbers");
        } else {
            System.out.println("Not Co-prime Numbers");
        }
    }
}
