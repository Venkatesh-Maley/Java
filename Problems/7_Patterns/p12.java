// PATTERN PRINTING - NUMBER PATTERNS - Basic Number Patterns
// 12. Print numbers from 1 to N in triangle form.

class p12 {
    public static void main(String[] args) {

        int n = 5;

        // ------------------------------------
        // 1. Numbers from 1 to N in triangle form
        // ------------------------------------
        System.out.println("Number Triangle (1 to N):");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ------------------------------------
        // 2. Repeating Number Triangle
        // ------------------------------------
        System.out.println("Repeating Number Triangle:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
