// PATTERN PRINTING - STAR PATTERNS - Pyramid Patterns
// 10. Print an X star pattern.

class p10 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                if (col == row || col == n - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
