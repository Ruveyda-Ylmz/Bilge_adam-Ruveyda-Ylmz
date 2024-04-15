package week05.consumer;

public class Product { //ConsumerTest04 ile ilişkili

    private String isim;

    private int fiyat;

    public Product(String isim, int fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public int getFiyat() {
        return  fiyat;
    }

}
