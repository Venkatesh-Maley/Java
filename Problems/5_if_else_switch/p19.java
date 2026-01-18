// IF ELSE SWITCH - NUMBER LOGIC
// 19. Find the factorial of an number.

class p19{
    public static void main(String[] args){
        int num = 3;
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial Value:" + fact);
    }
}

