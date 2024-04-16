package week05.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

    public static void main(String[] args) {
        //peek()
        Stream.of("one","two","three","four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("filtered value : " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("mapped value : " + e))
                .collect(Collectors.toList());

        Stream.of(1,2,3,4,5)
                .peek(i -> System.out.printf("%d",i))
                .map(i -> i*i)
                .peek(i -> System.out.printf("%d",i))
                .collect(Collectors.toList());

        //filter() sıfır ile 10 arasında bütün çift sayıların 3 katı
        IntStream.rangeClosed(0,10)
                .filter(i -> i%2 == 0)
                .map(i -> i*3)
                .forEach(System.out::println);

        //emptystringleri kaldırmak için filter() methodu kullanır.
        Stream.of("ruveyda","muşmuş","kaski")
                .filter(name ->!name.isEmpty()) //empy -> boş mu
                .forEach(System.out::println);

        //distinct() -> yinelenen (duplicate) değerlerin (value) kaldırdığı (remove) bir stream döndürür
        Stream.of("Java","Java","java","JAva","javva4")
                .distinct()
                .forEach(System.out::println);

        //skip() & limit()
        //skip(n) discard (görmezden gelme )işlemidir. n negatif olamaz.
        //limit() istenen boyutta daha uzun olmayan bir stream döndüren intermediate op.
        //ilk 3 çıktıyı yazmaz
        Stream.iterate(10, n -> n+2)
                .skip(3) // 10, 12, 14
                .limit(5)
                .forEach(System.out::println);

        //map interfacesi ile map methodu farklı şeylerdir.
        //map() -> verileri dönüştürmek için kulanılır.
        //Map interfacede ki Key,Value çifti tutan yapıyla karşılaştırılmalılır
        Stream<String> s = Stream.of("ruveyda","zubi","ruvi");
        s.map(String::length).forEach(System.out::println);

        List<String> stringList = Arrays.asList("1","2","3","4","5","6");
        List<Integer> evenNumberList = stringList.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);

        //sorted() -> doğal sıralmaya göre sıralar . comparable interface inden implement edilen öğeleri
        //barındırdığğı sürece efektif bir şekilde çalışır.
        //Stream<T> sorted (Comparantor<? super T)comparator);
        Stream<String > s1 = Stream.of("brown","bear-","bee");
        s1.sorted().forEach(System.out::println);
        //no! sorted() methodu kullandığımızda "java.lang.OutOfMemoryError:Java heap space sonucu elde ederiz.

        Stream.generate(() ->"luci") //generic sonsuzdur.limit ile sonu belirlenir
                .filter(n ->n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);



    }
}
