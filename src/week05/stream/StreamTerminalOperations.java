package week05.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        //count() -> sonlu bi Stream deki değerlerin sayısını belirtir.
        Stream<String> s2 = Stream.of("k1","k1","k3");
        long countElement =s2.count(); //count terminal operatorü
        System.out.println(countElement);

        //min(),max() String veya Arrayin minimum veya maximum değerlerini bulabilirz.
        Stream<String> stream01 = Stream.of("monkey","donkey","racoon");
        Stream<String> stream02 = Stream.of("monkey","donkey","racoon");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream01.min(comp);
        Optional<String> max = stream02.max(comp);

        System.out.println(min);
        System.out.println(max);

        String[] stringArr = "merhaba dünya ben, ruveyda xx".split(" ");
        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());


        Comparator<String> lenghtCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArr).min(lenghtCompare).get());

        //findAny() & findFirst()
        //find() -> Streamdeki öğelerden birini döndürür
        //Stream de hiçbir öge yoksa boş bir Optional<T> object dönünür.

        //FindFirst() Stream deki ilk öğeyi döndürür. hiçbir öğe yoksa optional <T> nesnesi döndürür.
        //findFirs() akışın ilk öğelerini döndürür ancak findAny() akışdaki herhangi bir
        //öğeyi seçmekte özgürdür.i(özellikle parallel Stream kullandığımızda)

        Stream<String> s = Stream.of("monkey","gorilla","dog");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.0,30.0,-7.5,41.2,2.2)
                .filter(temp -> temp > 0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10.1,-5.0,30.0,-7.5,41.2,2.2)
                .filter(temp -> temp > 0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);

        //anyMach() ,allMach(), noneMach()
        List<String> list = Arrays.asList("monkey","2","chimp");

        Stream<String> infinite01 = Stream.generate( () -> "chimp");
        Stream<String> infinite02 = Stream.generate( () ->"chimp");

        Predicate<String> pred = x ->Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));

        System.out.println(list.stream().allMatch(pred));

        System.out.println(list.stream().noneMatch(pred));

        //infinite

        System.out.println(infinite01.allMatch(pred));
        System.out.println(infinite02.noneMatch(pred));


        //forEaach()
        Stream<String> s01 = Stream.of("monkey","gorilla","chimp");
       // s01.forEach(System.out::println);

        List<String> list01 = new ArrayList<>();
        s01.forEach((str) -> {
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        });
        System.out.println(list01);

        //anyMach() Streamde veriler Predicate ile eşleşen herhangi bir öge varsa true değerini döndürür.
        //Stream boşsa veya eşleşen öğe yoksa false değerini dmndürür.

        //allMach() yalnız Stream deki tüm ögelerin veriler Predicate ile eşleşmesi durumunda true değeri
        //Stream boşsa true
            //DEVAMI VAR PUSHLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    }
}
