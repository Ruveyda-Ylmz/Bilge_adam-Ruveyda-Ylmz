package week05.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest02 {
    public static void main(String[] args) {
        //1.kullanım
        Consumer<Integer> consumer1 = x -> System.out.println(x * 2);
        Stream.of(1,2).forEach(consumer1);

        System.out.println("\n");
        //2.kullanım
        Consumer<Integer> consumer2 = (Integer x) -> System.out.println(x);
        Stream.of(1,2).forEach(consumer2);

        System.out.println("\n");
        //3.kullanım
        Stream.of(1,2).forEach(x -> System.out.println(x+2));

        System.out.println("\n");
        //4.kullanım
        Stream.of(1,2).forEach(System.out::println);
    }
}
