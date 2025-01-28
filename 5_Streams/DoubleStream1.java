import java.util.*;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;

public class DoubleStream{
    public static void main(String[] args)
    {
        //Creating a Double Stream
        DoubleStream stream = DoubleStream.of(3.4,4.5,6.7,8.9);
        //Using DoubleStream mapToObj(Double function mapper)
        //and Dispaying an Object-valued Stream
        stream.mapToObj(num -> {return num * num * num;}).forEach(System.out::println);
    }
}