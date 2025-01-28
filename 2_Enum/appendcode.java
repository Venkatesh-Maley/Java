import java.lang.*;
public class appendcode{
    public static void main(String[] args)
    {
        StringBuffer sbf = new StringBuffer("Geeks for Geeks");
        System.out.println("Sting Buffer=" +sbf);
        sbf.appendCodePoint(43);
        System.out.println("After appending Code Point is="+sbf);
    }
}