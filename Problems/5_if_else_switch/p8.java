// IF ELSE SWITCH - LARGEST / SMALLEST LOGIC
// 8. Find the largest of three numbers using if-else.

class p8{
    public static void main(String[] args){
        int a = 14;
        int b = 13;
        int c = 14;

        if (a > b && a>c){
            System.out.println("a is largest");
        }
        else if (b > a && b>c){
            System.out.println("b is largest");
        }
        else if (c > a && c>b){
            System.out.println("c is largest");
        }
        else if (a == b && a > c){
            System.out.println("a and b are largest");
        }
        else if (a == c && a > b){
            System.out.println("a and c are largest");
        }
        else if (b == c && b > a){
            System.out.println("b and c are largest");
        }
        else {
            System.out.println("All three numbers are equal");
        }
    }
}