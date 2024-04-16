package week05.function.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest05 {

    public static void main(String[] args) {

        //stringi alıp numerrik sitringse int dönecek (int al (parsal))
        Function<String,Integer> parseInt = Integer::parseInt;

        //intger al bir arttır geri dön
        Function<Integer,Integer> incrementExact = Math::incrementExact; //bir arttır

        //ikiside aynı işi yapıyor ikiside önce parseInt
        //methodu çalıştırıp sonra andThen ile 2.methodu çalıştırıyoruz.
        Function<String,Integer> parseIntAndIncrement = parseInt.andThen(incrementExact);

        //compose ile yapılması durumunda önce argüman işleniyor .
        //ondan sonra solunad ki methot(incrementExact) çalışıyor.
        Function<String,Integer> compose = incrementExact.compose(parseInt);

        Stream.of("-3","11","25","30","-1","-11").map(parseIntAndIncrement).forEach(System.out::println);
        //map() metodu String objelerini Integer objelerine cevirmek için kullanıldı.

        System.out.println("---------------------");

        //uzun yöntem
        List<String> stringList = Arrays.asList("a a","b b ","c c","d d");
        Function<String,String> upperCase = String::toUpperCase;
        stringList.stream().map(upperCase).forEach(System.out::println);

        //kısa yöntem
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);


    }

}
