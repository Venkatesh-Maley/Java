// LOOPS - MATH LOGIC
// 26. Print all factors of a given number.

class p26 {
    public static void main (String[] args){
        int num = 124;

        for (int i = 1; i <= num; i++){
            if (num%i == 0){
                System.out.println(i);
            }
        }
    }
}