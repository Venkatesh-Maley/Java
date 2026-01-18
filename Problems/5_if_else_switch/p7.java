// IF ELSE SWITCH - Basic conditions
// 7. Compare two numbers and print the smallest.

class p7{
    public static void main (String[] args){
        int num1 = 12;
        int num2 = 14;

        if (num1 < num2){
            System.out.println("num1 is smallest");
        }
        else if (num2 < num1){
            System.out.println("num2 is smallest");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}