package week05.supplier;

import java.util.function.Supplier;

public class SupplierTest01 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "supplier example";
        System.out.println(supplier.get());
    }
}
