// LOOPS - SERIES PRINTING
// 7. Calculate the power of a number without using Math.pow().

class p7 {
    public static void main (String[] args){
        int num = 2;
        int exponent = 3;

        int power = 1;

        for (int i = 1; i <= exponent; i++){
            power = power* num;
        }
        System.out.println(power);
    }
}