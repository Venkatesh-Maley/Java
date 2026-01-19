// LOOPS - DIGIT LOGIC
// 18. Find the smallest digit in a number.

class p18 {
    public static void main (String[] args){
        int num = 2353;
        int smallest = 10;

        while (num != 0){
            int digit = num%10;

            if (smallest > digit){
                smallest = digit;

            }

            num = num/10;
        }

        System.out.println("Smallest Number: " + smallest);
    }
}