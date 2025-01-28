import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class p29_ReadDataFromTextFile {
    public static void main(String [] args) throws FileNotFoundException{
        //Using Scanner & File

        File file = new File("C:\\Users\\M Venkatesh\\OneDrive\\Documents\\Skills\\Java\\Problems\\text.txt");

        try (Scanner sc = new Scanner(file)) {
            //loop statement
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
    }
}
