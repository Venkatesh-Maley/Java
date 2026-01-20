// PATTERN PRINTING - STAR PATTERNS - Pyramid Patterns
// 7. Print a double pyramid (hourglass shape).

class p7 {
    public static void main(String[] args) {

        int n = 5;

        // INVERTED PYRAMID (TOP)
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= 2 * (n - row) + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // NORMAL PYRAMID (BOTTOM)
        for (int row = 2; row <= n; row++) {

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
    }
}
