// PATTERN PRINTING - STAR + NUMBER COMBINATION PATTERNS
// 21. Print stars between numbers.

class p21 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                // print number
                System.out.print(col);

                // print star only between numbers
                if (col < row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

