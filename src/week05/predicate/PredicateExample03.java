package week05.predicate;

import java.util.function.Predicate;

public class PredicateExample03 {

    public static void main(String[] args) {

        Predicate<String> nullCheckPredicate = e -> e!=null;

        //uzunluğu 5 char dan büyük olan
        Predicate<String> lengCheckPredicate = e -> e.length() >5;

        //iki tane predicate yi and (ve) ile bağladık
        Predicate<String> andPredicate = nullCheckPredicate.and(lengCheckPredicate);

        String temp1 = null;
        String temp2 ="java";
        String temp3 ="alperen";
        String temp4 ="python";
        String temp5 ="ali";
        String temp6 ="hello";

        System.out.println(andPredicate.test(temp1));
        System.out.println(andPredicate.test(temp2));
        System.out.println(andPredicate.test(temp3));
        System.out.println(andPredicate.test(temp4));
        System.out.println(andPredicate.test(temp5));
        System.out.println(andPredicate.test(temp6));
    }
}
