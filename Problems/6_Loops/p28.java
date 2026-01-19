// LOOPS - MATH LOGIC
// 28. Find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers.

class p28 {
    public static void main (String[] args){
        int num1 = 12;
        int num2 = 18;
        int GCD = 1;
        int LCM = MATH.max(num1, num2);

        for ( int i = 1; i <= MATH.min(num1, num2); i++){
            if(num1%i == 0 && num2%i){
                GCD = i;
            }
        }
        System.out.println("GCD: " + GCD);
        
        while (true){
            if (lcm%num1 == 0 && lcm%num2 ==0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM: " + LCM);
    }
}