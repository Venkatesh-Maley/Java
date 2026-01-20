// PATTERN PRINTING - CHARACTER (ALPHABET) PATTERNS
// 18. Print an alphabet triangle (A, AB, ABC …) and alphabet pyramid.

class p18 {
    public static void main(String[] args) {

        int n = 5;

        // ------------------------------------
        // 1. ALPHABET TRIANGLE
        // ------------------------------------
        System.out.println("Alphabet Triangle:");

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char)('A' + col - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ------------------------------------
        // 2. ALPHABET PYRAMID
        // ------------------------------------
        System.out.println("Alphabet Pyramid:");

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // increasing alphabets
            for (int col = 1; col <= row; col++) {
                System.out.print((char)('A' + col - 1) + " ");
            }

            // decreasing alphabets
            for (int col = row - 1; col >= 1; col--) {
                System.out.print((char)('A' + col - 1) + " ");
            }

            System.out.println();
        }
    }
}
