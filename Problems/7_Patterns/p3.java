// PATTERN PRINTING - STAR PATTERNS - Basic Star Patterns
// 3. Print a left-aligned triangle and  right-aligned triangle star patterns.

class p3 {
    public static void main(String[] args) {

        int n = 5;

        // LEFT-ALIGNED TRIANGLE
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // gap

        // RIGHT-ALIGNED TRIANGLE
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

