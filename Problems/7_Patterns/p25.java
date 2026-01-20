// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 25. Print a number pyramid with star outline.

class p25 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            int num = 1;

            for (int col = 1; col <= 2 * row - 1; col++) {

                // star outline
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } 
                // numbers inside
                else {
                    System.out.print(num);

                    // update num ONLY when number is printed
                    if (col < row) {
                        num++;
                    } else {
                        num--;
                    }
                }
            }
            System.out.println();
        }
    }
}
