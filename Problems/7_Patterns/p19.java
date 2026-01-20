// PATTERN PRINTING - CHARACTER (ALPHABET) PATTERNS
// 19. Print a repeating alphabet pattern, inverted alphabet triangle, zig-zag alphabet pattern and character diamond pattern.

class p19 {
    public static void main(String[] args) {

        int n = 5;

        // -------------------------------------------------
        // REPEATING ALPHABET PATTERN
        // -------------------------------------------------
        System.out.println("Repeating Alphabet Pattern:");
        for (int row = 1; row <= n; row++) {
            char ch = (char) ('A' + row - 1);
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // INVERTED ALPHABET TRIANGLE
        // -------------------------------------------------
        System.out.println("Inverted Alphabet Triangle:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print((char) ('A' + col - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // ZIG-ZAG ALPHABET PATTERN
        // -------------------------------------------------
        System.out.println("Zig-Zag Alphabet Pattern:");
        char ch = 'A';

        for (int row = 1; row <= n; row++) {

            if (row % 2 != 0) { // left to right
                for (int col = 1; col <= n; col++) {
                    System.out.print(ch++ + " ");
                }
            } else { // right to left
                char temp = (char) (ch + n - 1);
                for (int col = 1; col <= n; col++) {
                    System.out.print(temp-- + " ");
                }
                ch += n;
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------------------------------
        // CHARACTER DIAMOND PATTERN
        // -------------------------------------------------
        System.out.println("Character Diamond Pattern:");
        int d = 3;

        // upper half
        for (int row = 1; row <= d; row++) {

            for (int space = 1; space <= d - row; space++) {
                System.out.print(" ");
            }

            char c = (char) ('A' + row - 1);

            if (row == 1) {
                System.out.println(c);
            } else {
                System.out.print(c);
                for (int space = 1; space <= 2 * row - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println(c);
            }
        }

        // lower half
        for (int row = d - 1; row >= 1; row--) {

            for (int space = 1; space <= d - row; space++) {
                System.out.print(" ");
            }

            char c = (char) ('A' + row - 1);

            if (row == 1) {
                System.out.println(c);
            } else {
                System.out.print(c);
                for (int space = 1; space <= 2 * row - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println(c);
            }
        }
    }
}
