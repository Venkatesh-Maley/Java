// LOOPS - DIGIT LOGIC
// 16. Print all Armstrong numbers in a given range.

class p16 {
    public static void main (String[] args){
        int start_range= 1;
        int end_range = 200;

        for (int i = start_range; i<= end_range; i++){
            
            int original = i;
            int temp = i;
            int i_len = String.valueOf(i).length();
            int sum = 0;


            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int j = 1; j <= i_len; j++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
        
    }
}