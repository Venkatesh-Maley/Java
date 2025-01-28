// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class type1{
    public static void main(String[] args)
        throws IOException
    {
        //Enter Data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Reading data using readLine
        String name = reader.readLine();

        //Printing the read line
        System.out.println(name);

    }
}