// IF ELSE SWITCH - NUMBER LOGIC
// 14. Check whether a number is composite.

class p14 {
    public static void main(String[] args) {

        int num = 12;
        boolean isComposite = false;

        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println("Given number is a Composite number");
        } else {
            System.out.println("Given number is NOT a Composite number");
        }
    }
}
