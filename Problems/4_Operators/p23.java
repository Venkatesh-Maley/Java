// Operators - Short-Circuit Operators
// 23. Demonstrate short-circuit behavior using ||

class p23 {
    public static void main(String[] args) {
        int a = 10;

        if (a > 5 || a / 0 > 1) {
            System.out.println("Short-circuit OR worked");
        }
    }
}
