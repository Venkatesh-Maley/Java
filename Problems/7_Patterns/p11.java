// PATTERN PRINTING - STAR PATTERNS - Hollow Star Patterns
//11. Print a hollow square, rectangle, right triangle, pyramid, diamond pattern star patterns.

class p11 {
    public static void main(String[] args) {

        int n = 5;

        // -------------------------------------------------
        // 1. HOLLOW SQUARE
        // -------------------------------------------------
        System.out.println("Hollow Square:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // 2. HOLLOW RECTANGLE (rows = 4, cols = 7)
        // -------------------------------------------------
        System.out.println("Hollow Rectangle:");
        int rows = 4, cols = 7;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // 3. HOLLOW RIGHT TRIANGLE
        // -------------------------------------------------
        System.out.println("Hollow Right Triangle:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // 4. HOLLOW PYRAMID
        // -------------------------------------------------
        System.out.println("Hollow Pyramid:");
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // stars and spaces
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // 5. HOLLOW DIAMOND
        // -------------------------------------------------
        System.out.println("Hollow Diamond:");

        // upper half
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // lower half
        for (int row = n - 1; row >= 1; row--) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
