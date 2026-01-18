// IF ELSE SWITCH - LARGEST / SMALLEST LOGIC
// 10. Find the middle number among three numbers.

class p10 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("Middle number is " + a);
        }
        else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("Middle number is " + b);
        }
        else if ((c > a && c < b) || (c > b && c < a)) {
            System.out.println("Middle number is " + c);
        }
        else {
            System.out.println("Middle number cannot be determined (numbers may be equal)");
        }
    }
}
