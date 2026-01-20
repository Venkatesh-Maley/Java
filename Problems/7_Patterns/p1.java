// PATTERN PRINTING - STAR PATTERNS - Basic Star Patterns
// 1. Print a right-angled triangle star pattern.

class p1 {
    public static void main (String[] args){
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}