// Operators - Short-Circuit Operators
// 22. Demonstrate short-circuit behavior using &&

class p22 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0 && a / b > 1) {
            System.out.println("Inside if");
        } else {
            System.out.println("Second condition not executed");
        }
    }
}
