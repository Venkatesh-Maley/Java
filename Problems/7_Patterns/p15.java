// PATTERN PRINTING - NUMBER PATTERNS - Advanced Number Patterns
// 15. Print a palindromic number pyramid.

class p15 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            int value = 1;

            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}
