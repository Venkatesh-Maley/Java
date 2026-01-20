// PATTERN PRINTING - NUMBER PATTERNS - Advanced Number Patterns
// 14. Print Floyd’s triangle.

class p14 {
    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

