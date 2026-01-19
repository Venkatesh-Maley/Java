// LOOPS - MATH LOGIC
// 27. Count the number of factors of a number.

class p27 {
    public static void main (String[] args){
        int num = 124;
        int count = 0;
        
        for (int i = 1; i <= num; i++){
            if (num%i == 0){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("Count:" + count);
    }
}