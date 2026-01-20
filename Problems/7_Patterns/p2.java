// PATTERN PRINTING - STAR PATTERNS - Basic Star Patterns
// 2. Print an inverted right-angled triangle star pattern.

class p2 {
    public static void main (String[] args){
        int n = 5;

        for (int row = 1; row <= n; row++ ){
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}