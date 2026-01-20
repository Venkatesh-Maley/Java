// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 22. Print alternate star and number rows.

class p22 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            if (row % 2 != 0) {
                // odd row → stars
                for (int col = 1; col <= n; col++) {
                    System.out.print("*");
                }
            } else {
                // even row → numbers
                for (int col = 1; col <= n; col++) {
                    System.out.print(col);
                }
            }

            System.out.println();
        }
    }
}
