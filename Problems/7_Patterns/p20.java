// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 20. Print numbers inside a star border.

class p20 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                // border condition
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } 
                // inside numbers
                else {
                    System.out.print(col - 1);
                }
            }
            System.out.println();
        }
    }
}
