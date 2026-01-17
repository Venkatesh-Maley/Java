// Operators - Increment / Decrement
// 16. Demonstrate pre-increment and post-increment.

class p16 {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.println("Post-increment:");
        System.out.println(a++); // prints first, then increments
        System.out.println(a);   // updated value

        System.out.println();

        System.out.println("Pre-increment:");
        System.out.println(++b); // increments first, then prints
        System.out.println(b);   // updated value
    }
}
