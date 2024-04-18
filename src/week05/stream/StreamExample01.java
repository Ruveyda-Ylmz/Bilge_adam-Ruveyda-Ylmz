package week05.stream;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample01 {

    public static void main(String[] args) {
        //Stream source oluşturma.
        Stream<String> stream1 = Stream.empty();
        Stream<Integer> stream2 = Stream.of(1);
        Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,7);

        //list i (yada çokl veri yapısını) stream a dönştürme
        List<String> list = Arrays.asList("a","b", "c");
        Stream<String> fromList = list.stream(); //artık stream pipeline ine

        //generation & Iteration
        //random sayılar oluşturabiliriz, iterasyon yapabiliriz.
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        Stream<Integer> oddNumber = Stream.iterate(1, n -> n+2).limit(5);
        randoms.forEach(System.out::println);
        System.out.println("ODDDDDD");
        oddNumber.forEach(System.out::println);

        //stream pipeline flow.
        Arrays.stream(Object.class.getMethods()) //source  OBJE SINIFININ BÜTÜN METHODLAROI
                .map(Method::getName) //Intermediate
                .distinct() //intermeditia
                .forEach(System.out::println); //terminal opeRATİON

        //RANGE VE RANGECLOSE
        IntStream.range(1,10).forEach(System.out::println); //1-10arasını yazdırır 10 dahil değil
        IntStream.range(1,5).map(e -> e*2).forEach(System.out::println); //1-5 arası yazdırır 1,4 dahil değil

        //başlangıç bitiş değerlerin,i verilerek  bir IntStream de oluşturulabilir.
        IntStream.iterate(10, i ->i+5) //10+5 15+5 20+5....
                .limit(6)
                .forEach(System.out::println);




    }
}
