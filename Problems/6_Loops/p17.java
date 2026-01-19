// LOOPS - DIGIT LOGIC
// 17. Find the largest digit in a number.

class p17 {
    public static void main (String[] args){
        int num = 124523;   
        int largest = 0;

        while (num != 0){
            int digit = num % 10;

            if (digit > largest){
                largest = digit;
            }

            num = num / 10;

        }

        System.out.println("Largest digit: " + largest);
    }
}