import java.util.Random;

public class p12_Random_Strings {
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        int stringLength = 8; // Length of the random strings

        // Generate and print 10 random strings
        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder(stringLength);

            for (int j = 0; j < stringLength; j++) {
                int index = rand.nextInt(characters.length());
                sb.append(characters.charAt(index));
            }

            System.out.println("Random String " + (i + 1) + " is: " + sb.toString());
        }
    }
}


