import java.io.*;
public class CopyFile {
    public static void main(String args[])
    {
        FileWriter out = null;

        try{
            out = FileReader("Hi");
            out.write("Welcome to RGUKT");
            System.out.println("Success");
        out.close();
        }catch(IOException e){
        System.out.println(e);}
    }
}

