// IF ELSE SWITCH - LARGEST / SMALLEST LOGIC
// 8. Find the smallest of three numbers using if-else.

class p9{
    public static void main(String[] args){
        int a = 14;
        int b = 13;
        int c = 14;

        if (a < b && a<c){
            System.out.println("a is smallest");
        }
        else if (b < a && b<c){
            System.out.println("b is smallest");
        }
        else if (c < a && c<b){
            System.out.println("c is smallest");
        }
        else if (a == b && a < c){
            System.out.println("a and b are smallest");
        }
        else if (a == c && a < b){
            System.out.println("a and c are smallest");
        }
        else if (b == c && b < a){
            System.out.println("b and c are smallest");
        }
        else {
            System.out.println("All three numbers are equal");
        }
    }
}