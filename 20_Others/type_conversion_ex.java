// Java program to Illustrate Explicit Type Conversion
/*
class type_conversion {

    public static void main(String[] args)
    {

        double d = 100.04;

        // Explicit type casting by forcefully getting data from long datatype to integer type
        long l = (long)d;

        // Explicit type casting
        int i = (int)l;

        System.out.println("Double value " + d);

        // While printing we will see that fractional part lost
        System.out.println("Long value " + l);

        System.out.println("Int value " + i);
    }
}
*/

// Java Program to Illustrate Conversion of
// Integer and Double to Byte

// Main class
class type_conversion {

    // Main driver method
    public static void main(String args[])
    {
        // Declaring byte variable
        byte b;

        // Declaring and initializing integer and double
        int i = 257;
        double d = 323.142;

        // Display message
        System.out.println("Conversion of int to byte.");

        // i % 256
        b = (byte)i;

        // Print commands
        System.out.println("i = " + i + " b = " + b);
        System.out.println(
            "\nConversion of double to byte.");

        // d % 256
        b = (byte)d;

        // Print commands
        System.out.println("d = " + d + " b= " + b);
    }
}