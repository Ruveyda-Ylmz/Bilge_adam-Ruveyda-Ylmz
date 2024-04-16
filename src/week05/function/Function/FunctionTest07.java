package week05.function.Function;

import java.util.function.Function;

public class FunctionTest07 {
    //metin dizgisini alıp uzunluğunu hesaplayan program
    //uzunluğu alınan metin dizgisini alıp,uzunluğun karesini hesaplayan bir function,
    //bu iki fonctionu birleştirip bir arada uygulayan function:

    public static void main(String[] args) {

        Function<String,Integer> stringLength = String::length;

        Function<Integer,Integer> karesi = n -> n*n;

        Function<String,Integer> combinedFunction = stringLength.andThen(karesi);

        System.out.println(combinedFunction.apply("ruveyda"));





    }
}
