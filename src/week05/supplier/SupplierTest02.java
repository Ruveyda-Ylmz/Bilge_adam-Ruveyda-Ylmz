package week05.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest02 {

    //public static<T> Stream <T> generate(Supplier<? extends T> s)
    public static void main(String[] args) {

        //random üs sınır 20 olana kadar satı üret
        Supplier<Integer> supplier01 = () -> new Random().nextInt(20);

        //5 adet üret(generate)  Stream(aktarım)
        Stream.generate(supplier01).limit(5).forEach(System.out::println);

        System.out.println("--------------");
        Supplier<Integer> supplier02 = new Random()::nextInt;
        //6 sayı üret 5 den büyük //burada ki yapıyı methodlar kullanarak yazın
        Stream.generate(supplier02).
                limit(6)
                .filter(number -> number > 5)
                .forEach(System.out::println);

        Supplier<Integer> supplier03 = SupplierTest02::createRandomNumber;
        System.out.println(supplier03.get());
    }


    public static Integer createRandomNumber(){
        return new Random().nextInt();
    }
}
