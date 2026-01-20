// PATTERN PRINTING - STAR PATTERNS - Pyramid Patterns
// 6. Print a diamond star pattern.

class p6 {
    public static void main(String[] args) {

        int n = 5;

        // UPPER PYRAMID
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // LOWER INVERTED PYRAMID
        for (int row = 1; row <= n - 1; row++) {

            // spaces
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= 2 * (n - row) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
