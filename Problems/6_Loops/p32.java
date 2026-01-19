// LOOPS - LOOP CONTROL
// 32. Demonstrate usage of break and continue statement.

class p32 {
    public static void main(String[] args) {

        System.out.println("Demonstrating CONTINUE:");
        
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // If i is 5, skip this iteration
            if (i == 5) {
                continue;   // skips printing 5
            }

            // This line will not execute when i == 5
            System.out.println(i);
        }

        System.out.println("\nDemonstrating BREAK:");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // If i is 7, stop the loop completely
            if (i == 7) {
                break;      // exits the loop
            }

            // This line will execute only till i = 6
            System.out.println(i);
        }
    }
}
