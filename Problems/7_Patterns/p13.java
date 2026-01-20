// PATTERN PRINTING - NUMBER PATTERNS - Basic Number Patterns
// 13. Print a number pyramid and inverted number pyramid

class p13 {
    public static void main(String[] args) {

        int n = 5;

        // ------------------------------------
        // 1. NUMBER PYRAMID
        // ------------------------------------
        System.out.println("Number Pyramid:");

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }

            // decreasing numbers
            for (int num = row - 1; num >= 1; num--) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        System.out.println();

        // ------------------------------------
        // 2. INVERTED NUMBER PYRAMID
        // ------------------------------------
        System.out.println("Inverted Number Pyramid:");

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int num = 1; num <= n - row + 1; num++) {
                System.out.print(num + " ");
            }

            // decreasing numbers
            for (int num = n - row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
