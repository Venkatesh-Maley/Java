// Java program to Illustrate Type promotion in Expressions
/*
class type_conversion {
    public static void main(String args[])
    {
        // Declaring and initializing primitive types
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s); // Our Expression

        System.out.println("result = " + result);    // Printing the result obtained after all the promotions are done
    }
}
*/

// Java program to Illustrate Type Casting
// in Integer to Byte

// Main class
class type_conversion {

    // Main driver method
    public static void main(String args[])
    {

        // Declaring byte array
        byte b = 50;

        // Type casting int to byte
        b = (byte)(b * 2);

        // Display value in byte
        System.out.println(b);
    }
}
