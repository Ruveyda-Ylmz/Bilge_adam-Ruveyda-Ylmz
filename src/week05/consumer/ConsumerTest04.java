package week05.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest04 {
    /*
    * bir Product sınıfı oluşturalım.isim ve fiyatı olsun.
    * AllArgsConstructor'ı olsun .
    * Encapsulation kurallarına uygun bir şekilde hzırlayalım.
    * */
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop",  40000));
        products.add(new Product("phone",80000));
        products.add(new Product("tablet",50000));

        //consumer kullanarak her bir ürünü adını ve fiyatını yazdıralım.

        Consumer<Product> consumer1 = product -> {
            System.out.println(product.getFiyat());
            System.out.println(product.getIsim());
        };

        products.forEach(consumer1);









    }
}
