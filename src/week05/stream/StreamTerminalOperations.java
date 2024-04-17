package week05.stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
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

        String[] stringArr = "merhaba dünya ben, ruveyda?".split(" ");
        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());


        Comparator<String> lenghtCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArr).min(lenghtCompare).get());

        //findAny() & findFirst()
        //find() -> Streamdeki öğelerden birini döndürür;
        //Stream de hiçbir öge yoksa boş bir Optional<T> object dönünür.

        //FindFirst() Stream deki ilk öğeyi döndürür. hiçbir öğe yoksa optional <T> nesnesi döndürür.
        //findFirs() akışın ilk öğelerini döndürür ancak findAny() akışdaki herhangi bir
        //öğeyi seçmekte özgürdür.(özellikle parallel Stream kullandığımızda)


        Stream<String> s = Stream.of("monkey","gorilla","dog");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp >0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp >0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);

        //-------------------------------------------------------------------------------------------------


        //anyMatch(), allMatch(), noneMatch()
        List<String> list = Arrays.asList("monkey","2","chimp");

        Stream<String> infinite01 = Stream.generate(() -> "chimp");
        Stream<String> infinite02 = Stream.generate(() -> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        //anyMatch() Stream'de verilen Predicate ile eşleşen herhangi bir öğe varsa true değerini döndürür.
        //Stream boşsa veya eşleşen öğe yoksa false değerini döndürür.
        System.out.println(list.stream().anyMatch(pred)); //true

        //allMatch() yalnızca Stream'deki tüm öğelerin verilen Predicate ile eşleşmesi durumunda true değerini döndürür.
        //Stream boşsa true değerini döndürür.
        System.out.println(list.stream().allMatch(pred)); //false

        //noneMatch(), yalnızca Stream'deki öğelerin hiçbiri verilen Predicate ile eşleşmediğinde true değerini döndürür.
        //Stream boşsa true değerini döndürür.
        //Sonsuz Streamler için sonlandırıladabilir, sonlandırılamayadabilir (verilere bağlıdır).
        System.out.println(list.stream().noneMatch(pred)); //false

        //-------------------------------------------------------------------------

        // infinitive
        System.out.println("\n INFINITE \n");
        System.out.println(infinite01.anyMatch(pred)); //true
//        System.out.println(infinite01.allMatch(pred)); //true ->endless loop

        System.out.println(infinite02.noneMatch(pred)); //false

        //forEach() pipeline'daki terminal işlemidir.
        Stream<String> s01 = Stream.of("Monkey","Gorilla","Chimp");
//        s01.forEach(System.out::println);

        List<String> list01 = new ArrayList<>();
        s01.forEach((str)-> {
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        } );
        System.out.println(list01);

        //--------------------------------------------
        //map() vs forEach()
        System.out.println("\n MAP() VS FOREACH() \n");
        //forEach() -> void döner ,dolayısıyla içerisnde de void dönen bir işlem olmalı.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //numbers.forEach( number -> numbers*2); //numbers*2 -> bu kısım void döndüğü için sout yazabiliriz çünkü sout da void döner
        numbers.forEach( number -> System.out.println(number*2));
        System.out.println(numbers);

        //map() //terminal değer -> stream değer döner
        //map le yapılan işkem içerideki veriye işlem yapmaz orjinal değer korunur.
        //collectors bunları toplar listeye atar (liste formatına döndürür)
//      List<Integer> mappedNumber = numbers.stream()
//              .map(number -> number*2)
//              .map(number -> number*2)
//              .collect(Collectors.toList())
//                      .stream()
//                      .map(number -> number*2)
//                       .collect(Collectors.toList());
//        System.out.println(mappedNumber);


        //2.yöntem
        List<Integer> mappedNumber2 = numbers.stream()
                .map(number -> number*2)
                .map(number -> number*2)
                .collect(Collectors.toList());
        mappedNumber2.forEach(System.out::println);
        mappedNumber2 = mappedNumber2.stream().map(number -> number*2).collect(Collectors.toList());
        System.out.println(mappedNumber2);

        //raduce()
        System.out.println("\n REDUCE \n ");
        Stream<Integer> stream = Stream.of(3,5,6);
        Stream<Integer> stream1 = Stream.of(3,5,6);

        System.out.println(stream.reduce(10,(a,b) -> a*b));

        System.out.println(stream1.reduce((a,b) -> a*b));//değer olmazsa diye opsiyonel ile kendini sarmalar

        //--------------------------------------

        //reduce
        Stream<String> stream3 = Stream.of("w1","o2","l3","f4");
      //  String word = stream3.reduce("X",(x,y) -> x.concat(y));
        String word = stream3.reduce("x",String::concat);
        System.out.println(word);

        Stream<String> stream4 = Stream.of("w","o","l","f");
        //String word2 = stream4.reduce("",(c,d) -> c+d+"--");
        String word2 = String.valueOf(stream4.reduce("",(c,d) -> c+"--"+d));
        System.out.println(word2);

        //collect
        System.out.println("\n COLLECT \n");
        String frenchCounting = "un:deux :: trois:quatre";

        List<String> gmailList = Arrays.stream(Pattern.compile(":")
                .split(frenchCounting)).collect(Collectors.toList());
        System.out.println(gmailList); //[un, deux , ,  trois, quatre]

        List<String> gmailList2 = List.of(frenchCounting.split(":"));
        System.out.println(gmailList2); //[un, deux , ,  trois, quatre]

        //collerct ()
        System.out.println("\n collerct()\n");
        Set<String> gmailSet = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toSet());
        System.out.println(gmailSet); //[,  trois, quatre, un, deux ]

        //collect(Collectors.toMap())
        System.out.println("\n collect(Collectors.toMap()) \n");
        Map<String,Integer> nameLength = Stream.of("albus","percival","wulfric","brian","dumbledore")
                .collect(Collectors.toMap(name -> name , String::length));
        System.out.println(nameLength); //{percival=8, wulfric=7, albus=5, brian=5, dumbledore=10}

        Optional<String> name = Stream.of("albus","percival","wulfric","brian","dumbledore")
                .reduce(String::concat);

        Map<String,Integer> nameLength2 = Stream.of(name.get())
                .collect(Collectors.toMap(name2 -> name2 ,String::length));
        System.out.println(nameLength2); //{albuspercivalwulfricbriandumbledore=35}

        //StringBuilder()
        System.out.println("\n StringBuilder()\n");
        Stream<String> stream5 = Stream.of("w","o","l","f");
        StringBuilder word3 = stream5
                .collect(StringBuilder::new //(a,b)
                        ,StringBuilder::append //a
                        ,StringBuilder::append); //b

        System.out.println(word3); //wolf

        //treeset
        System.out.println("\n TREESET\n");
        Stream<String> stream6 = Stream.of("w","o","l","f");
        TreeSet<String> set = stream6.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); //[f, l, o, w]







    }

}
