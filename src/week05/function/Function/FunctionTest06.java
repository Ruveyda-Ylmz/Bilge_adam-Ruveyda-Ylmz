package week05.function.Function;

import java.util.function.Function;

public class FunctionTest06 {

    public static void main(String[] args) {

        //metin dizisini (string) alıp sayıları çıkaran bir Function tanımlayalım
        Function<String,String> extractNumbers = text -> { //functionların lamda ile kullanımı
            StringBuilder numbers = new StringBuilder();
            for (char c : text.toCharArray()){
                if (Character.isDigit(c)){
                    numbers.append(c);
                }
            }
            return numbers.toString();
        };
        String sentence = "I have 3 apples and 5 orenges";
        String extratedNumbers = extractNumbers.apply(sentence);
        System.out.println("Extracted numbers: "+ extratedNumbers);
    }
}
