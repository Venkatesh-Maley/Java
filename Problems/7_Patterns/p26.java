// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 26. Print stars on even rows and numbers on odd rows.

class p26 {
    public static void main(String[] args) {

        int n = 5;
        int cols = 4; // number of elements in each row

        for (int row = 1; row <= n; row++) {

            if (row % 2 == 0) {
                // even row → stars
                for (int col = 1; col <= cols; col++) {
                    System.out.print("*");
                }
            } else {
                // odd row → numbers
                for (int col = 1; col <= cols; col++) {
                    System.out.print(col + " ");
                }
            }

            System.out.println();
        }
    }
}
