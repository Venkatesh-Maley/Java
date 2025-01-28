class Output1 {
    public static void main(String args[])
    {
        int x = 100;
        System.out.printf("Printing simple Integer: x = %d\n", x);

        // This will Print it up to 2 decimal places
        System.out.printf("Formatted with Precision: PI = %.2f\n", Math.PI);

        float n = 5.2f;
        System.out.printf("Formatted to specific width: n = %.4f\n", n);
        // Automatically appends zero to the rightmost part

        n = 2324435.3f;
        // Here, the number is formatted to a 20-character width, right-aligned
        System.out.printf("Formatted to right margin: n = %20.4f\n", n);
    }
}
