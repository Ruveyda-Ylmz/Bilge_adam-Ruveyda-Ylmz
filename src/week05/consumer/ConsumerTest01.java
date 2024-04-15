package week05.consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {
    public static void main(String[] args) {
        //str.toUpperCase() = tüketirken üretim de bulundu
       // consumer tüketicidir döndürmek zorundaq değildir
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("java");
    }
}
