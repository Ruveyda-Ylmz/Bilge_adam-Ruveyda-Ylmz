package week05.parallestream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamExample01 {
    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream();
        Stream<Integer> parallelStream = stream.parallel();
        System.out.println(parallelStream.count());

        Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
        System.out.println(parallelStream2.count());

        Arrays.asList("jackal","racoon","kangaroo").parallelStream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println); //parelel stream karışık verii basar sıralama yoktur
    }
}
