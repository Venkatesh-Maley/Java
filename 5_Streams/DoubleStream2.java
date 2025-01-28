import java.util.*;
import java.math.BigDecimal;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;
public class DoubleStream{
    public static void main(String[] args)
    {
        //Creating a DoubleStream
        DoubleStream stream = DoubleStream.of(3.4,4.5,6.7,8.9);
        Stream <BigDecimal> stream1 = stream.mapToObj(BigDecimal::valueOf);
        Stream.forEach(num -> System.out.println(num.add(BigDecimal.TEN)));
    }
}