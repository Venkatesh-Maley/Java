// PATTERN PRINTING - STAR PATTERNS - Pyramid Patterns
// 9. Print an hourglass star pattern.

class p9 {
    public static void main(String[] args) {

        int n = 5;

        // TOP INVERTED PYRAMID
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * (n - row) + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // BOTTOM PYRAMID
        for (int row = 2; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
