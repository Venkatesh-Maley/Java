// Operators - Logical Operators
// 14. Explain difference between logical AND (&&) and bitwise AND (&).

class p14 {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        // Logical AND (&&)
        if (b != 0 && a / b > 1) {
            System.out.println("Logical AND");
        } else {
            System.out.println("Logical AND prevented division by zero");
        }

        // Bitwise AND (&)
        try {
            if (b != 0 & a / b > 1) {
                System.out.println("Bitwise AND");
            }
        } catch (Exception e) {
            System.out.println("Bitwise AND caused exception");
        }
    }
}
