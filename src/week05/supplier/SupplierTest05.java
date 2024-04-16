package week05.supplier;

import java.util.Optional;

public class SupplierTest05 {

    private static String staticName = "staticName";

    public static void main(String[] args) {
        /*Optional ,geri bildirim.
        *veri tabanında çekilen değer boş ise bir hata dönme fonksiyonu gibidir.
         *kodu patlatmadan hatanın nerde olduğunu söyler devam ettirebilir.
         */


        Optional<String> name = findNameById(1L); //1 dıiında farklı bir değer girilir ise empty değerini verir
        if (name.isEmpty()){
            System.out.println("girdiğiniz id yoktur");
            System.exit(1);
        }
        System.out.println(name);

        String name2 = findNameById(2L).orElseGet(() ->staticName);
        System.out.println(name2);
    }

    private static Optional<String> findNameById(Long id){ //dönebiliyosan isim dön
        String name = null;
        if (id == 1L){
            name = "java";
        }
        return Optional.ofNullable(name);
    }
}
