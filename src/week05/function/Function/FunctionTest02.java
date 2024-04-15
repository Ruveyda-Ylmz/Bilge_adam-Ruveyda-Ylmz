package week05.function.Function;

import java.util.function.Function;

public class FunctionTest02 {
    public static void main(String[] args) {

        Function<String,Integer> f1 = str -> Integer.parseInt(str);
        Function<String ,Integer> f2 = Integer::parseInt; //stringi int tipine dönüştürür

        int result = f1.apply("1234"); //kanıt1
        System.out.println(f1.apply("1034")); //kanıt 2
        System.out.println((f1.apply("859")/2));

        Function<Integer,Integer> f3 = Math::abs;
        Function<Integer,Integer> f4 = x -> Math.abs(x);
        System.out.println(f3.apply(-123));
        System.out.println(f4.apply(-123));
    }
}
