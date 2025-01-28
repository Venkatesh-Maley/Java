// Java program to illustrate using return
/*
class control {
    public static void main(String args[])
    {
        boolean t = true;
        System.out.println("Before the return.");

        if (t)
            return;

        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");
    }
}
*/

// Java program to illustrate using
// continue in an if statement
class control {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is even,  skip and continue

            if (i % 2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}

