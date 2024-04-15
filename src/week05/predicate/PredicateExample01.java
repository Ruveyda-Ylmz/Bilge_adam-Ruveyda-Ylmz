package week05.predicate;


import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample01 {

    //Predicate(yüklem), predicate bayraklama demekdir
    public static void main(String[] args) {

        //boolen türünde
        //her bir stringe elemenet diyorum. her bir element de a ile başlıyo mu diye bakıyorum

        Predicate<String> predicate1 = element -> element.startsWith("a");

        Predicate<String> predicate2 = (String element) -> element.startsWith("a");

        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("a");
        };

        /*filtreleme işlemi ("java","alperen","python","ali","hello") -> (f,t,f,t,f)
          true false diye bakıyor true olanları filtreleyip alıyor
        */
        Stream.of("java","alperen","python","ali","hello").filter(predicate1).forEach(System.out::println);
    }
}
