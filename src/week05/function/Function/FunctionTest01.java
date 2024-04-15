package week05.function.Function;

import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {

        Function<String,Integer> lenghtFunction1 = e -> e.length(); //e bir string
        Function<String,Integer> lenghtFunction2 = (String e) -> e.length(); //kaç karakter olduğunu bulur

        //Function<F,R> T = Argüman type ,R = return type
        int result1 = lenghtFunction1.apply("java");
        int result2 = lenghtFunction1.apply("alperen");
        int result3 = lenghtFunction1.apply("yılmaz");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
