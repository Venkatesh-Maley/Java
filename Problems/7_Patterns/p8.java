// PATTERN PRINTING - STAR PATTERNS - Pyramid Patterns
// 8. Print a butterfly star pattern.

class p8 {
    public static void main(String[] args) {

        int n = 4;

        // UPPER HALF
        for (int row = 1; row <= n; row++) {

            // left stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // middle spaces
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // right stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // LOWER HALF
        for (int row = n; row >= 1; row--) {

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
