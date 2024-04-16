package week05.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierTest04 {
    public static void main(String[] args) {
        Stream.of("java8","Supplier","example")
                .forEach(name -> {
                    printName( () -> name); //consumer oldu
                });

        List<String> stringsList = Stream.generate(SupplierTest04::createNewString)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(stringsList.size());
    }

    private  static void printName(Supplier<String> supplier){
        System.out.println(supplier.get());
    }

    private static String createNewString(){
        return  new String();
    }
}
