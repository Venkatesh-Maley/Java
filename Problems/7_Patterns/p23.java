// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 23. Print a mixed pyramid (stars + numbers).

class p23 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // left star (except first row)
            if (row > 1) {
                System.out.print("* ");
            }

            // increasing numbers
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }

            // decreasing numbers
            for (int num = row - 1; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // right star (except first row)
            if (row > 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
