// TypeCasting - int → float
// 3. Explain difference between implicit and explicit type casting.

class p3 {
    public static void main(String[] args) {

        // 🔹 Implicit Type Casting (Widening)
        int a = 10;
        float b = a;   // automatic conversion

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + a);
        System.out.println("float value: " + b);

        System.out.println();

        // 🔹 Explicit Type Casting (Narrowing)
        float x = 10.75f;
        int y = (int) x;   // manual conversion

        System.out.println("Explicit Casting:");
        System.out.println("float value: " + x);
        System.out.println("int value: " + y);
    }
}
