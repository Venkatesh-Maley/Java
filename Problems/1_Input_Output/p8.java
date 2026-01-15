import java.util.Scanner;

class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char x = sc.next().charAt(0);

        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {

            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
                x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {

                System.out.println("Given character is a vowel");
            } else {
                System.out.println("Given character is a consonant");
            }

        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }
}
