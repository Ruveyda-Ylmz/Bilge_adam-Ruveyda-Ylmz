package week05.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample04 {
    public static void main(String[] args) {

        List<String> stringsTempList = new ArrayList<>();
        stringsTempList.add("java");
        stringsTempList.add("alperen");
        stringsTempList.add("python");
        stringsTempList.add("ali");
        stringsTempList.add("hello");

        //başı a harfi olan veriyi listeden çıkardı
        stringsTempList.removeIf(str -> str.startsWith("a"));
        stringsTempList.forEach(System.out::println);

        //boş mu diye kontrol yapıyor
        Predicate<String> predicate1 = String::isEmpty;

      //stringsTempList.removeIf(String::isEmpty); //farklı kullanımı
       // Predicate<String> predicate2 = String::length; //int değer döner hata verir
       // Predicate<String> predicate3 = String::startsWith; //paremetre girmem gerekecek o yüzden çalıştırmaz

    }
}
