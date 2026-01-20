// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 24. Print a hollow pattern with numbers inside.

class p24 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                // star border
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                }
                // numbers inside
                else {
                    System.out.print(col - 1);
                }
            }
            System.out.println();
        }
    }
}
