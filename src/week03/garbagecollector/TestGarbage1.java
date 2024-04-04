package week03.garbagecollector;

public class TestGarbage1 {

    /*finalize():garbage collector içinde temizlme görevi yapar.
    new anaktar sözcüğü ile açılan tüm nesneler otomatik silinir
    eğer new ile tanımlanmadı ise diğer objeler finalize() ile silinir */

    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        TestGarbage1 garbage1 = new TestGarbage1();

        /*   bunlar heapte ayrı yerde tutuluyorlar. */
        TestGarbage1 garbage2 = new TestGarbage1();

        TestGarbage1 garbage3 = new TestGarbage1();

        /*   bunlar heapte aynı nesneyi referans alıyorlar.  */
        TestGarbage1 garbage4 = garbage3;

        garbage1 = null;
        garbage2 = null;
        garbage3 = null;
        garbage4 = null; //bunun çöpü yoktur, çünkü değerini garbage3'den alıyor.
        // Yani garbage3 ve garbage4 heap'te aynı değere referanslanmış.

        //constructor
        new TestGarbage1();

        //temizleme işlemi
        System.gc();
    }
}
