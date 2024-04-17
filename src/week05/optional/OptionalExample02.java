package week05.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample02 {
    public static void main(String[] args) {

        Optional<String> nullStr = Optional.ofNullable(null);
        // nullStr = null; //null değer atandığı zamnn .NullPointerException hatsı verir,
        // Optional.empty() yazmayı önerir çünkü optional da bu değer null demktir.
        System.out.println(nullStr);
        nullStr = Optional.of("ruveyda");
        nullStr.ifPresent(e -> System.out.println(e.toUpperCase()));
        nullStr = Optional.empty();
        nullStr.ifPresent(e -> System.out.println(e.toLowerCase()));
        System.out.println(findNameById(2L));
        System.out.println(findNameById2(2L));

        findNameById(2L).ifPresentOrElse(s -> System.out.println("merhaba"+s),()-> System.out.println("üzgünüm"));

        if (findNameById2(2L) == null){
            System.out.println("merhabaa" +findNameById2(2L));
        }else{
            System.out.println("üzgünüm bulunamadı");
        }

        Optional<String> nullStr2 = Optional.ofNullable(null); //Optional.empty
        System.out.println(nullStr2.map(String::length).orElse(-1));
        System.out.println(nullStr2.map(String::length).orElseThrow(RuntimeException::new));

    }
    public static Optional<String> findNameById(Long id){
        String name = null;
        if (id == 1){
            name = "rovi";
        }
        return Optional.ofNullable(name);
    }

    public static String findNameById2(Long id){
        String name = null;
        if (id == 1){
            name = "rovii";
        }
        return name;
    }
}
